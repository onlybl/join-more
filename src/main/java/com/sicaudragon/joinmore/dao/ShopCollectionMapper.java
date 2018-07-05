package com.sicaudragon.joinmore.dao;

import com.sicaudragon.joinmore.pojo.DO.ShopCollection;
import com.sicaudragon.joinmore.pojo.DTO.ShopDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * 店铺收藏
 * @author BeFondOfTaro
 * Created at 11:34 2018/7/5
 */
public interface ShopCollectionMapper {

    /**
     * 根据店铺id查询收藏信息
     * @param shopId 店铺id
     * @return
     */
    ShopCollection getByShopId(@Param("shopId") String shopId);

    /**
     * 查询当前用户下对应店铺id的收藏记录
     * @param userId 用户id
     * @param shopId 店铺id
     * @return
     */
    ShopCollection getByUserIdAndShopId(@Param("userId") String userId, @Param("shopId") String shopId);

    /**
     * 插入一条店铺收藏信息
     * @param shopCollection 店铺收藏信息
     * @return
     */
    int insert(ShopCollection shopCollection);

    /**
     * 根据用户id 和店铺id删除一条记录
     * @param userId 用户id
     * @param shopId 店铺id
     * @return
     */
    int deleteByUserIdAndShopId(@Param("userId") String userId, @Param("shopId") String shopId);

    /**
     * 根据用户d查询用户收藏的店铺
     * @param userId 用户id
     * @return
     */
    List<ShopDTO> listShopByUserId(@Param("userId") String userId);
}
