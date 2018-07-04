package com.sicaudragon.joinmore.pojo.DO;

import lombok.Data;

import java.util.Date;
@Data
public class User {
    /**用户id .*/
    private String id;
    /**用户名 .*/
    private String username;
    /**真实姓名 .*/
    private String realName;
    /**邮箱 .*/
    private String email;
    /**电话 .*/
    private String phone;
    /**地址 .*/
    private String address;
    /**密码 .*/
    private String password;
    /**是否锁定 .*/
    private String locked;
    /**创建时间 .*/
    private Date createTime;
    /**更新时间 .*/
    private Date updateTime;
    /**最后一次登陆时间 .*/
    private Date lastTime;
}
