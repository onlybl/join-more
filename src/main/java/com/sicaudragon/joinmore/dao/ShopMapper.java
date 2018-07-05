package com.sicaudragon.joinmore.dao;

import com.sicaudragon.joinmore.pojo.DTO.ShopDTO;

import java.util.List;

/**
 * 店铺
 * @author BeFondOfTaro
 * Created at 10:59 2018/7/5
 */
public interface ShopMapper {

    /**
     * 查询所有店铺信息
     * @return
     */
    List<ShopDTO> listShop();
}
