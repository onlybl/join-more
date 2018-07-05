package com.sicaudragon.joinmore.service.impl;

import com.sicaudragon.joinmore.dao.ShopMapper;
import com.sicaudragon.joinmore.pojo.DTO.ShopDTO;
import com.sicaudragon.joinmore.service.ShopService;
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

    @Override
    public List<ShopDTO> listShop() {
        return shopMapper.listShop();
    }
}
