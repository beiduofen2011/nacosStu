package com.fen.dou.service;


import com.fen.dou.entity.User;
import com.fen.dou.mapper.ProductMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 仓储服务 服务实现类
 * </p>
 *
 * @author lihaodong
 * @since 2019-11-25
 */
@Slf4j
@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private ProductMapper productMapper;


    @Autowired
    private IUserService userService;

    @Override
    public boolean reduceCount(Integer productId, Integer amount) throws Exception {
        User user =  userService.findUser();
        Integer record = productMapper.reduceCount(productId,amount);
        return false;
    }





    private void checkStock(Integer productId, Integer requiredAmount) throws Exception {
        log.info("检查 {} 库存", productId);
        int countInDb = productMapper.selectCountById(productId);
        log.info("数据库库存:{}",countInDb);
        if (countInDb < requiredAmount) {
            log.warn("{} 库存不足，当前库存:{}", productId, countInDb);
            throw new Exception("库存不足");
        }
    }
}
