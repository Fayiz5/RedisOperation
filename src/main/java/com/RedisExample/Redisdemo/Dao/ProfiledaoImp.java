package com.RedisExample.Redisdemo.Dao;

import com.RedisExample.Redisdemo.Conf.RedisConf;
import com.RedisExample.Redisdemo.Entities.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class ProfiledaoImp implements Profiledao{

    @Autowired
    private RedisTemplate redisTemplate;

    public static final String key="PROFILE";
    @Override
    public boolean saveProfie(Profile profile) {
        try {
            redisTemplate.opsForList().leftPush(key, profile);
            return true;
        }
        catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Object fetchProfile() {

        return redisTemplate.opsForList().leftPop(key);
    }

    @Override
    public boolean deletekey() {
        try{
            redisTemplate.delete(key);
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }
}

