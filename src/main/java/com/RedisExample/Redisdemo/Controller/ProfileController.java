package com.RedisExample.Redisdemo.Controller;

import com.RedisExample.Redisdemo.Entities.Profile;
import com.RedisExample.Redisdemo.Services.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class ProfileController {

    @Autowired
    private ProfileService profileService;

    @GetMapping("/sayak")
    public String display(){
        return "satak";
    }
    @PostMapping("/profile")
    public ResponseEntity<String> SaveProfile(@RequestBody Profile profile){
        System.out.println("heloo");
        boolean p=profileService.saveProfie(profile);
        if(p)
            return ResponseEntity.ok("Profile Created");
        else
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }

    @GetMapping("/profile")
    public ResponseEntity<Object> getprofile(){
        Object res=profileService.fetchProfile();
        return new ResponseEntity<>(res,HttpStatus.FOUND);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deletekey(){
        boolean res=profileService.deletekey();
        if(res)
            return ResponseEntity.ok("key deleted");
        else
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }
}
