package com.sicaudragon.joinmore.dao;


import com.sicaudragon.joinmore.pojo.DTO.ProductDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductCollectionMapper {
    /**
     * 查询用户收藏商品
     * @param userId
     * @return
     */
    List<ProductDTO> selectProductByUserId(@Param("userId") String userId);
}
