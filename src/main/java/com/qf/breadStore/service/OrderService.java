package com.qf.breadStore.service;

import com.qf.breadStore.domain.vo.ShopCartVo;

import java.util.List;

public interface OrderService {
    public List<ShopCartVo> findOrder();
}
