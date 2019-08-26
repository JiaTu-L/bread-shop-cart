package com.qf.breadStore.domain.vo;

import com.qf.breadStore.domain.entity.Shop;
import lombok.Data;

import java.lang.reflect.Type;
import java.util.List;
@Data
public class ShopVo extends Shop {
    List<Type> typeList;
}
