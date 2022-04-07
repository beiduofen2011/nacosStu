package com.fen.dou.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserVo implements Serializable {
    private Integer count;
    private String username;
    private String password;
}

