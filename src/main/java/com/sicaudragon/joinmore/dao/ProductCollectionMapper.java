package com.sicaudragon.joinmore.dao;

import com.sicaudragon.joinmore.pojo.DO.Product;
import com.sicaudragon.joinmore.pojo.DO.ProductCollection;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductCollectionMapper {
    List<Product> selectProductByUserId(@Param("userId") String userId);

    int insertProductCollection(ProductCollection productCollection);

}
