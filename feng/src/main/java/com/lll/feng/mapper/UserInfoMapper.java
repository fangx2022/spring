package com.lll.feng.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lll.feng.pojo.entity.UserInfoEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfoEntity> {

    /**
     * 连表查询 1对多
     */
    @Select("select user_id,user_name,password,age,create_date,description from user_info")
    @Results(
            {
                    @Result(column = "user_id",property = "userId"),
                    @Result(column = "user_name",property = "username"),
                    @Result(column = "age",property = "age"),
                    @Result(column = "create_date",property = "createDate"),
                    @Result(column = "description",property = "description"),
                    @Result(column = "user_id",property = "orders",javaType = List.class,
                    many=@Many(select = "com.lll.feng.mapper.OrderInfoMapper.selectOrderListByUserId"))
            }
    )
    List<UserInfoEntity> selectAllUserAndOrders();


    /**
     * 以下普通增删改查
     * @return
     */
//    @Select("select user_id,user_name,password,age,create_date from user")
//    List<User> selectUserList();
//
//    @Insert("insert into user values(#{userId},#{username},#{password},#{age},#{createDate})")
//    int insertUser(User user);
//
//    @Delete("delete from user where user_id= #{userId}")
//    int deleteUserById(Integer userId);
//
//    @Update("update user set user_name = #{username},password = #{password} where user_id = #{userId}")
//    int updateUser(User user);
//
//    @Select("select user_id,user_name,password,age,create_date from user where user_id=#{userId}")
//    User selectUserById(Integer userId);
}
