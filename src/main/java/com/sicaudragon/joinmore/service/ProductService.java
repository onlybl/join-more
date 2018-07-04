package com.sicaudragon.joinmore.service;

import com.github.pagehelper.PageInfo;
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

    /**
     * 分页查询所有商品
     * @param page 页码
     * @param limit 数量
     * @return
     */
    PageInfo<Product> listProductByPage(int page, int limit);
}
