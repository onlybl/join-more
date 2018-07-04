package com.sicaudragon.joinmore.pojo.DO;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.sicaudragon.joinmore.util.serializer.Date2LongSerializer;
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
    /** 商品类别id .*/
    private String categoryTypeId;
    /**创建时间 .*/
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date createTime;
    /**更新时间 .*/
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date updateTime;
}
