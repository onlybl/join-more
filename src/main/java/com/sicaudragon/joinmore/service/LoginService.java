package com.sicaudragon.joinmore.service;


import com.sicaudragon.joinmore.pojo.DO.User;

public interface LoginService {
    User login(String username, String password);
}
