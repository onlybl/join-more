package com.sicaudragon.joinmore.service;

import com.sicaudragon.joinmore.pojo.DTO.ShopDTO;

import java.util.List;

/**
 * 店铺服务
 * @author BeFondOfTaro
 * Created at 11:06 2018/7/5
 */
public interface ShopService {

    /**
     * 查询所有店铺
     * @return
     */
    List<ShopDTO> listShop();
}
