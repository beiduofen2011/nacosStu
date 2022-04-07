package com.fen.dou.mapper;

import com.fen.dou.entity.User;
import com.fen.dou.entity.UserVo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User findUser();
    void updateUser();
    UserVo findUserProduct();

}


