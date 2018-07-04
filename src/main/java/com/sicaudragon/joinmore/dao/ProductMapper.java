package com.sicaudragon.joinmore.dao;

import com.sicaudragon.joinmore.pojo.DO.Product;
import com.sicaudragon.joinmore.pojo.DTO.ProductDTO;

import java.util.List;

/**
 * 商品
 * @author BeFondOfTaro
 * Created at 10:23 2018/7/4
 */
public interface ProductMapper {

    /**
     * 查询所有商品
     * @return
     */
    List<ProductDTO> list();
}
