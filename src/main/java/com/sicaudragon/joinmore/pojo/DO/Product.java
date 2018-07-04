package com.sicaudragon.joinmore.pojo.DO;

import lombok.Data;

import java.util.Date;

@Data
public class Product {
    /** 商品id .*/
    private String id;
    /** 所属店铺id .*/
    private String shopId;
    /** 商品名称 .*/
    private String name;
    /** 商品价格 .*/
    private String price;
    /** 商品库存 .*/
    private String stock;
    /** 商品描述 .*/
    private String description;
    /** 商品小图 .*/
    private String icon;
    /** 商品状态 .*/
    private String status;
    /** 商品类别 .*/
    private String categoryType;
    /**创建时间 .*/
    private Date createTime;
    /**更新时间 .*/
    private Date updateTime;
}
