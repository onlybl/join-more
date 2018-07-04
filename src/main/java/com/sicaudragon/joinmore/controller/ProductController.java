package com.sicaudragon.joinmore.controller;

import com.sicaudragon.joinmore.pojo.VO.ResultVO;
import com.sicaudragon.joinmore.service.ProductService;
import com.sicaudragon.joinmore.util.web.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author BeFondOfTaro
 * Created at 10:27 2018/7/4
 */
@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("product")
    public ResultVO listProduct(){
        return ResultVOUtil.success(productService.listProduct());
    }
}
