package com.lll.feng.mapper;

import com.lll.feng.pojo.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select user_id,user_name,password,age,create_date from user")
    List<User> selectUserList();

    @Insert("insert into user values(#{userId},#{userName},#{password},#{age},#{createDate})")
    int insertUser(User user);

    @Delete("delete * from user where user_id= #{userId}")
    int deleteUserById(Integer userId);

    @Update("update user set user_name = #{userName},password = #{password} where user_id = #{userId}")
    int updateUser(User user);

    @Select("select user_id,user_name,password,age,create_date from user where user_id=#{userId}")
    User selectUserById(Integer userId);
}
