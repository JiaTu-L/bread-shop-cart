package com.qf.breadStore.controller;

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
    public Result order(){
        try {
            List<ShopCartVo> order = orderService.findOrder();
            return Result.success(order);
        } catch (Exception e) {
            log.error(e.getMessage());
        }
        return Result.error();
    }
}
