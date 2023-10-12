package com.RedisExample.Redisdemo.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Profile implements Serializable {
    private String name;
    private long phonenumber;
    private String city;
}
