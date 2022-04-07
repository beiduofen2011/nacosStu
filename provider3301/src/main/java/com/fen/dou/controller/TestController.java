package com.fen.dou.controller;

import com.fen.dou.entity.User;
import com.fen.dou.entity.UserVo;
import com.fen.dou.mapper.UserMapper;
import com.fen.dou.service.IProductService;
import com.fen.dou.service.IUserService;
import com.fen.dou.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {
    @Resource
    private IUserService userService;

    @Resource
    private IProductService productService;

    @GetMapping(value = "/test1")
    public User test1(){
        return this.userService.findUser();
    }
    @GetMapping(value = "/test2")
    public UserVo test5(){
        return this.userService.findUserProduct();
    }
    @GetMapping(value = "/update")
    public void test2(){
         this.userService.updateUser();
    }

    @GetMapping(value = "/update1")
    public void test3() throws Exception {
        this.productService.reduceCount(1,1);
    }
}
