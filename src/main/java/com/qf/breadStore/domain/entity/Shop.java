package com.qf.breadStore.domain.entity;

import lombok.Data;

@Data
public class Shop {
    private Integer shopId;

    private String shopName;

    private String shopImage;

    private String detailImage;

    private Double price;

    private String intro;

    private Integer stock;

    private Integer typeId;

    private Integer subMenuId;
}