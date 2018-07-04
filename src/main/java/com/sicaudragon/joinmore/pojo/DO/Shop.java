package com.sicaudragon.joinmore.pojo.DO;

import lombok.Data;

@Data
public class Shop {
    /**店铺id .*/
    private String id;
    /**用户id .*/
    private String userId;
    /**店铺名字 .*/
    private String name;
    /**店铺简介 .*/
    private String description;
}
