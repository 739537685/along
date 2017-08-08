package com.example.ssmspringboot.mapper;

import com.example.ssmspringboot.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {


    User searchUser();

    @Select("select * from userinfo")
    User selectUser();
}
