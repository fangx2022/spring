package com.lll.feng.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.List;

@Data
@TableName("user_info")
public class UserInfoEntity {

    @TableId(value="user_id",type = IdType.AUTO)
    private Integer userId;

    @TableField(value = "user_name")
    private String username;

    @TableField(value = "password")
    private String password;

    @TableField(value="age")
    private Integer age;

    @TableField(value="create_date")
    private String createDate;

    @TableField(exist = false)
    private List<OrderInfoEntity> orders;

}
