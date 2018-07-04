package com.sicaudragon.joinmore.service;

import com.sicaudragon.joinmore.pojo.DO.Product;

import java.util.List;

/**
 * 商品服务
 * @author BeFondOfTaro
 * Created at 10:25 2018/7/4
 */
public interface ProductService {

    /**
     * 查询所有商品
     * @return
     */
    List<Product> listProduct();
}
