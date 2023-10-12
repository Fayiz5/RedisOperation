package com.RedisExample.Redisdemo.Services;

import com.RedisExample.Redisdemo.Entities.Profile;

import java.util.List;

public interface ProfileService {
    boolean saveProfie(Profile profile);
    Object fetchProfile();
    boolean deletekey();

}
