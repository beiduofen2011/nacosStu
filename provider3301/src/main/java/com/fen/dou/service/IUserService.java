package com.fen.dou.service;

import com.fen.dou.entity.User;
import com.fen.dou.entity.UserVo;

import java.util.List;

public interface IUserService {
    void updateUser();
    User findUser();
    UserVo findUserProduct();
}
