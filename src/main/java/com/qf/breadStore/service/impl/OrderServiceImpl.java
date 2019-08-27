package com.qf.breadStore.service.impl;

import com.qf.breadStore.domain.entity.Shop;
import com.qf.breadStore.domain.entity.Shopcar;
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
    public List<ShopCartVo> findCart(int uid){
        List<ShopCartVo> shopCartVos = shopcarMapper.findCartByUid(uid);
        return shopCartVos;
    }

    @Override
    public int addCart(int uid, int shopId, int number) {
        int count = shopcarMapper.addCart(uid,shopId,number);
        return count;
    }



    @Override
    public int updateCartByOb(int cartId, int ob) {
        int count = shopcarMapper.updateCartNum(cartId, ob);
        return count;
    }

    @Override
    public int deleteCart(int uid) {
        int i = shopcarMapper.deletCar(uid);
        return i;
    }

    @Override
    public List<Shopcar> findCartByUidShopId(int uid, int shopId) {
        List<Shopcar> cart = shopcarMapper.findCartByUidShopId(uid, shopId);
        return cart;
    }
}
