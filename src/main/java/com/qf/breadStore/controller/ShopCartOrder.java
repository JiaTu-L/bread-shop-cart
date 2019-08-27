package com.qf.breadStore.controller;

import com.qf.breadStore.domain.entity.Shop;
import com.qf.breadStore.domain.entity.Shopcar;
import com.qf.breadStore.domain.vo.ShopCartVo;
import com.qf.breadStore.service.OrderService;
import com.qf.breadStore.utile.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
@Slf4j
public class ShopCartOrder {
    @Resource
    OrderService orderService;

    @GetMapping("/order")
    public Result order(int uid){
        try {
            List<ShopCartVo> order = orderService.findCart(uid);
            return Result.success(order);
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return Result.error();
    }

    @GetMapping("/check")
    public Result checkOrder(int uid,int shopId){
        try {
            List<Shopcar> cartByUidShopId = orderService.findCartByUidShopId(uid, shopId);
            if(cartByUidShopId==null || "".equals(cartByUidShopId)){
                return Result.success(cartByUidShopId);
            }else {
                return Result.error();
            }
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return Result.error();
    }
    @GetMapping("/add")
    public Result addOrder(int shopId,int uid,int number){
        try {
            int count = orderService.addCart(shopId, uid, number);
            return Result.success(count);
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return Result.error();
    }

    @GetMapping("/delete")
    public Result delete(int uid){
        try {
            int count = orderService.deleteCart(uid);
            return Result.success(count);
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return Result.error();
    }
}
