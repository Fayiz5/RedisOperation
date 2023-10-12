package com.RedisExample.Redisdemo.Dao;

import com.RedisExample.Redisdemo.Entities.Profile;
import java.util.List;
public interface Profiledao {
    boolean saveProfie(Profile profile);
    Object fetchProfile();
    boolean deletekey();


}
