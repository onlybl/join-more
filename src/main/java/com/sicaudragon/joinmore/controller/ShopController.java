package com.sicaudragon.joinmore.controller;

import com.sicaudragon.joinmore.pojo.VO.ResultVO;
import com.sicaudragon.joinmore.service.ShopService;
import com.sicaudragon.joinmore.util.web.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author BeFondOfTaro
 * Created at 11:11 2018/7/5
 */
@RestController
public class ShopController {

    @Autowired
    private ShopService shopService;

    @GetMapping("shop")
    public ResultVO listShop(){
        return ResultVOUtil.success(shopService.listShop());
    }
}
