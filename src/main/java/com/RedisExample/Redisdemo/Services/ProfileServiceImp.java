package com.RedisExample.Redisdemo.Services;

import com.RedisExample.Redisdemo.Dao.Profiledao;
import com.RedisExample.Redisdemo.Entities.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProfileServiceImp implements ProfileService{

    @Autowired
    private Profiledao profiledao;


    @Override
    public boolean saveProfie(Profile profile) {
        return profiledao.saveProfie(profile);
    }

    @Override
    public Object fetchProfile() {
        return profiledao.fetchProfile();

    }

    @Override
    public boolean deletekey() {
        return profiledao.deletekey();
    }
}
