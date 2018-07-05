package com.sicaudragon.joinmore.service.impl;

import com.sicaudragon.joinmore.config.exception.CommonException;
import com.sicaudragon.joinmore.constants.ResultEnum;
import com.sicaudragon.joinmore.dao.UserMapper;
import com.sicaudragon.joinmore.pojo.DO.User;
import com.sicaudragon.joinmore.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService{
    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String username, String password) {
        User user = userMapper.selectUser(username,password);
        if(userMapper.selectUser(username,password) != null){
            return user;
        }else{
            throw new CommonException(ResultEnum.LOGIN_FAILED);
        }

    }
}
