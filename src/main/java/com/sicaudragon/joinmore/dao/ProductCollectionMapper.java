package com.sicaudragon.joinmore.dao;

import com.sicaudragon.joinmore.pojo.DO.ProductCollection;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductCollectionMapper {
    List<ProductCollection> selectProductCollectionByUserId(@Param("userId") String userId);

    int insertProductCollection(ProductCollection productCollection);

}
