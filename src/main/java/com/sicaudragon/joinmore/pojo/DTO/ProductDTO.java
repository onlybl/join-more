package com.sicaudragon.joinmore.pojo.DTO;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.sicaudragon.joinmore.pojo.DO.CategoryType;
import com.sicaudragon.joinmore.pojo.DO.Shop;
import com.sicaudragon.joinmore.util.serializer.Date2LongSerializer;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author BeFondOfTaro
 * Created at 15:39 2018/7/4
 */
@Data
public class ProductDTO {
    /** 商品id .*/
    private String id;
    /** 所属店铺id .*/
    private Shop shop;
    /** 商品名称 .*/
    private String name;
    /** 商品价格 .*/
    private BigDecimal price;
    /** 商品库存 .*/
    private Integer stock;
    /** 商品描述 .*/
    private String description;
    /** 商品小图 .*/
    private String icon;
    /** 商品状态 .*/
    private Integer status;
    /** 商品类别 .*/
    private String categoryType;
    /**创建时间 .*/
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date createTime;
    /**更新时间 .*/
    @JsonSerialize(using = Date2LongSerializer.class)
    private Date updateTime;
}
