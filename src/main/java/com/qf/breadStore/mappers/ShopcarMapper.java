package com.qf.breadStore.mappers;


import com.qf.breadStore.domain.vo.ShopCartVo;

import java.util.List;

public interface ShopcarMapper {
    List<ShopCartVo> findOrder();
    insertCart();
}