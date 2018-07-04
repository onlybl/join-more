package com.sicaudragon.joinmore.pojo.DO;

import lombok.Data;

@Data
public class ShopCollection {
    /** 店铺收藏记录id .*/
    private String id;
    /** 收藏人id .*/
    private String userId;
    /** 收藏店铺id .*/
    private String shopId;
}
