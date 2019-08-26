package com.qf.breadStore.service.impl;

import com.qf.breadStore.domain.vo.ShopCartVo;
import com.qf.breadStore.mappers.ShopcarMapper;
import com.qf.breadStore.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("orderService")
public class OrderServiceImpl implements OrderService {
    @Resource
    ShopcarMapper shopcarMapper;
    @Override
    public List<ShopCartVo> findOrder(){
        List<ShopCartVo> shopCartVos = shopcarMapper.findOrder();
        return shopCartVos;
    }
}
