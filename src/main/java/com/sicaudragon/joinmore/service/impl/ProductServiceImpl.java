package com.sicaudragon.joinmore.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sicaudragon.joinmore.dao.ProductCollectionMapper;
import com.sicaudragon.joinmore.dao.ProductMapper;
import com.sicaudragon.joinmore.pojo.DO.Product;
import com.sicaudragon.joinmore.pojo.DTO.ProductDTO;
import com.sicaudragon.joinmore.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author BeFondOfTaro
 * Created at 10:25 2018/7/4
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private ProductCollectionMapper productCollectionMapper;
    @Override
    public List<ProductDTO> listProduct() {
        return productMapper.list();
    }

    @Override
    public PageInfo<ProductDTO> listProductByPage(int page, int limit) {
        PageHelper.startPage(page, limit);
        return new PageInfo<>(listProduct());
    }

    @Override
    public List<ProductDTO> listProductCollextion(String userId) {
        return productCollectionMapper.selectProductByUserId(userId);
    }

    @Override
    public void deleteProductCollection(String userId, String productId) {
        productCollectionMapper.delectProductCollection(userId,productId);
    }
}
