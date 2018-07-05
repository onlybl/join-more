package com.sicaudragon.joinmore.dao;


import com.sicaudragon.joinmore.pojo.DO.ProductCollection;
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

    /**
     * 删除一条收藏记录
     * @param userId
     * @param productId
     */
    void delectProductCollection(@Param("userId") String userId,@Param("productId") String productId);

    /**
     * 新增一条
     * @param productCollection
     * @return
     */
    int insertProductCollection(ProductCollection productCollection);
}
