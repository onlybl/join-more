package com.sicaudragon.joinmore.pojo.DO;

import lombok.Data;

@Data
public class ProductCollection {
    /** 商品收藏记录id .*/
    private String id;
    /** 收藏人id .*/
    private String userId;
    /** 收藏商品id .*/
    private String productId;
}
