package com.sicaudragon.joinmore.controller;


import com.sicaudragon.joinmore.pojo.VO.ResultVO;
import com.sicaudragon.joinmore.service.LoginService;
import com.sicaudragon.joinmore.util.web.ResultVOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping("/log")
    public ResultVO login(@RequestParam("username") String username,
                          @RequestParam("password") String password){
        return ResultVOUtil.success(loginService.login(username,password));
    }
}
