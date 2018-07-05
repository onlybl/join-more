package com.sicaudragon.joinmore.controller;

import com.sicaudragon.joinmore.pojo.DO.Product;
import com.sicaudragon.joinmore.pojo.DO.ProductCollection;
import com.sicaudragon.joinmore.pojo.VO.ResultVO;
import com.sicaudragon.joinmore.service.ProductService;
import com.sicaudragon.joinmore.util.KeyUtil;
import com.sicaudragon.joinmore.util.web.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("productCollection")
    public ResultVO listProductCollection(@RequestParam("userId") String userId){
        return ResultVOUtil.success(productService.listProductCollextion(userId));
    }

    @GetMapping("user/{userId}/{productId}/delete")
    public ResultVO deleteProductCollection(@PathVariable String userId,
                                            @PathVariable String productId){
        productService.deleteProductCollection(userId,productId);
        return ResultVOUtil.success();
    }
    @GetMapping("user/{userId}/{productId}/insert")
    public ResultVO insertProductCollection(@PathVariable("userId") String userId
                                            ,@PathVariable("productId") String productId){
        ProductCollection productCollection = new ProductCollection();
        productCollection.setUserId(userId);
        productCollection.setProductId(productId);
        productCollection.setId(KeyUtil.genUniqueKey());
        return ResultVOUtil.success(productService.insertProductCollection(productCollection));
    }
}
