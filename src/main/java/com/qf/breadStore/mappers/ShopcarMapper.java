package com.qf.breadStore.mappers;


import com.qf.breadStore.domain.entity.Shop;
import com.qf.breadStore.domain.entity.Shopcar;
import com.qf.breadStore.domain.vo.ShopCartVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopcarMapper {
    List<ShopCartVo> findCartByUid(@Param("uid")int uid);
    int addCart(@Param("uid")int uid,@Param("shop_id")int shopId,@Param("number")int number);
    int updateCartNum(@Param("car_id")int carId,@Param("ob") int ob);
    int deletCar(@Param("car_id")int carId);
    List<Shopcar> findCartByUidShopId(@Param("uid")int uid, @Param("shopId")int shopId);
}