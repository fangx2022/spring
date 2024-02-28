package com.lll.feng.pojo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

@TableName("order_info")
@Data
public class OrderInfoEntity {

    @TableId
    private Integer orderId;

    @TableField
    private String orderName;

    @TableField
    private String orderDate;

    @TableField
    private BigDecimal totalAmount;

    @TableField
    private String userId;

    @TableField(exist = false)
    private UserInfoEntity user;
}
