package com.sicaudragon.joinmore.pojo.DTO;

import lombok.Data;

/**
 * 店铺
 * @author BeFondOfTaro
 * Created at 10:57 2018/7/5
 */
@Data
public class ShopDTO {
    /**店铺id .*/
    private String id;
    /**用户名 .*/
    private String username;
    /**店铺名字 .*/
    private String name;
    /**店铺简介 .*/
    private String description;
}
