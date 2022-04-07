package com.fen.dou.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by smlz on 2019/12/9.
 */
@Mapper
public interface ProductMapper {

    Integer reduceCount(@Param("productId") Integer productId, @Param("amount") Integer amount);

    Integer selectCountById(@Param("productId") Integer productId);
}
