package com.sicaudragon.joinmore.dao;

import com.sicaudragon.joinmore.pojo.DO.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    User selectUserById(@Param("userId") String userId);

    int insert(User user);

    int delectUserById(@Param("userId") String userId);

}
