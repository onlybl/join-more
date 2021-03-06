package com.sicaudragon.joinmore.service;

import com.github.pagehelper.PageInfo;
import com.sicaudragon.joinmore.pojo.DO.Product;
import com.sicaudragon.joinmore.pojo.DO.ProductCollection;
import com.sicaudragon.joinmore.pojo.DTO.ProductDTO;

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
    List<ProductDTO> listProduct();

    /**
     * 分页查询所有商品
     * @param page 页码
     * @param limit 数量
     * @return
     */
    PageInfo<ProductDTO> listProductByPage(int page, int limit);

    /**
     * 查询所有用户收藏商品
     * @param userId
     * @return
     */
    List<ProductDTO> listProductCollextion(String userId);

    /**
     * 取消商品收藏
     * @param userId
     * @param productId
     */
    void deleteProductCollection(String userId, String productId);

    /**
     * 新增一条商品收藏
     * @param productCollection
     * @return
     */
    int insertProductCollection(ProductCollection productCollection);
}
