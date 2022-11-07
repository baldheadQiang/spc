package com.spc.mapper;

import com.spc.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    public User login(@Param("username") String username , @Param("password") String password);
}
