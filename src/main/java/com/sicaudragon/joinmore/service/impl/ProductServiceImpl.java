package com.sicaudragon.joinmore.service.impl;

import com.sicaudragon.joinmore.dao.ProductMapper;
import com.sicaudragon.joinmore.pojo.DO.Product;
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

    @Override
    public List<Product> listProduct() {
        return productMapper.list();
    }
}
