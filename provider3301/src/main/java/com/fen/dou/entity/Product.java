package com.fen.dou.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 仓储服务
 * </p>
 *
 * @author lihaodong
 * @since 2019-11-25
 */
@Data
public class Product implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 主键
     */
    private Integer id;

    /**
     * 商品Id
     */
    private Integer userId;


    /**
     * 库存数量
     */
    private Integer count;


}
