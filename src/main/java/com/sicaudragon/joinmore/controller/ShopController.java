package com.sicaudragon.joinmore.controller;

import com.sicaudragon.joinmore.pojo.VO.ResultVO;
import com.sicaudragon.joinmore.service.ShopService;
import com.sicaudragon.joinmore.util.web.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 店铺操作
 * @author BeFondOfTaro
 * Created at 11:11 2018/7/5
 */
@RestController
public class ShopController {

    @Autowired
    private ShopService shopService;

    /**
     * 查询所有店铺
     * @return
     */
    @GetMapping("shop")
    public ResultVO listShop(){
        return ResultVOUtil.success(shopService.listShop());
    }

    /**
     * 收藏店铺
     * @param userId 用户id
     * @param shopId 店铺id
     */
    @GetMapping("collect-shop")
    public ResultVO collectShop(@RequestParam String userId, @RequestParam String shopId){
        shopService.collectShop(userId,shopId);
        return ResultVOUtil.success();
    }

    /**
     * 取消收藏
     * @param userId 用户id
     * @param shopId 店铺id
     */
    @GetMapping("cancelCollectShop")
    public ResultVO cancelCollectShop(@RequestParam String userId, @RequestParam String shopId){
        shopService.cancelCollectShop(userId, shopId);
        return ResultVOUtil.success();
    }

    /**
     * 根据用户d查询用户收藏的店铺
     * @param userId 用户id
     * @return
     */
    @GetMapping("user/{userId}/shop")
    public ResultVO listShopByUserId(@PathVariable String userId){
        return ResultVOUtil.success(shopService.listShopByUserId(userId));
    }
}
