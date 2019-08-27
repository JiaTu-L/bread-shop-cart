package com.qf.breadStore.service;

import com.qf.breadStore.domain.entity.Shop;
import com.qf.breadStore.domain.entity.Shopcar;
import com.qf.breadStore.domain.vo.ShopCartVo;

import java.util.List;

public interface OrderService {
    public List<ShopCartVo> findCart(int uid);
    public int addCart(int uid,int shopId,int number);
    public int updateCartByOb(int cartId,int ob);
    public int deleteCart(int uid);
    public List<Shopcar> findCartByUidShopId(int uid, int shopId);
}
