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

    /**
     * 收藏店铺
     * @param userId 用户id
     * @param shopId 店铺id
     */
    void collectShop(String userId,String shopId);

    /**
     * 取消收藏
     * @param userId 用户id
     * @param shopId 店铺id
     */
    void cancelCollectShop(String userId, String shopId);

    /**
     * 根据用户d查询用户收藏的店铺
     * @param userId 用户id
     * @return
     */
    List<ShopDTO> listShopByUserId(String userId);
}
