package com.fen.dou.service;

import com.fen.dou.entity.User;
import com.fen.dou.entity.UserVo;
import com.fen.dou.mapper.ProductMapper;
import com.fen.dou.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private ProductMapper productMapper;

    @Override
    public void updateUser() {
        userMapper.updateUser();
    }

    @Override
    @Transactional
    public User findUser() {
        userMapper.findUser();
        userMapper.findUser();
        return userMapper.findUser();
    }

    public UserVo findUserProduct() {
        return userMapper.findUserProduct();
    }
}
