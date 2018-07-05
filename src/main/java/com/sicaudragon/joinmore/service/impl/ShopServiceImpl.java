package com.sicaudragon.joinmore.service.impl;

import com.sicaudragon.joinmore.dao.ShopCollectionMapper;
import com.sicaudragon.joinmore.dao.ShopMapper;
import com.sicaudragon.joinmore.pojo.DO.ShopCollection;
import com.sicaudragon.joinmore.pojo.DTO.ShopDTO;
import com.sicaudragon.joinmore.service.ShopService;
import com.sicaudragon.joinmore.util.KeyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author BeFondOfTaro
 * Created at 11:08 2018/7/5
 */
@Service
public class ShopServiceImpl implements ShopService {

    @Autowired
    private ShopMapper shopMapper;
    @Autowired
    private ShopCollectionMapper shopCollectionMapper;

    @Override
    public List<ShopDTO> listShop() {
        return shopMapper.listShop();
    }

    @Override
    public void collectShop(String userId,String shopId) {
        if (null == shopCollectionMapper.getByUserIdAndShopId(userId, shopId)){
            ShopCollection shopCollection = new ShopCollection(
                    KeyUtil.genUniqueKey(),userId,shopId
            );
            shopCollectionMapper.insert(shopCollection);
        }
    }

    @Override
    public void cancelCollectShop(String userId, String shopId) {
        shopCollectionMapper.deleteByUserIdAndShopId(userId, shopId);
    }

    @Override
    public List<ShopDTO> listShopByUserId(String userId) {
        return shopCollectionMapper.listShopByUserId(userId);
    }
}
