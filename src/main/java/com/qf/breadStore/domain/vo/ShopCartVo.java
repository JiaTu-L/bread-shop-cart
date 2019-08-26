package com.qf.breadStore.domain.vo;

import com.qf.breadStore.domain.entity.Shop;
import com.qf.breadStore.domain.entity.Shopcar;
import com.qf.breadStore.domain.entity.User;
import lombok.Data;

import java.util.List;
@Data
public class ShopCartVo extends Shopcar {
    List<User> userList;
    List<Shop> shopList;
}
