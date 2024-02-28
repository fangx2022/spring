package com.lll.feng.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lll.feng.pojo.entity.OrderInfoEntity;
import com.lll.feng.pojo.entity.UserInfoEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface OrderInfoMapper extends BaseMapper<OrderInfoEntity> {

    @Select("select order_id,order_name,order_date,total_amount,user_id from order_info where " +
            "user_id=#{userId}")
    List<OrderInfoEntity> selectOrderListByUserId(Integer userId);

    /**
     * 连表查询 1对1
     */
    @Select("select order_id,order_name,order_date,total_amount,user_id from order_info")
    @Results(
            {
                    @Result(column = "order_id",property = "orderId"),
                    @Result(column = "order_name",property = "orderName"),
                    @Result(column = "order_date",property = "orderDate"),
                    @Result(column = "total_amount",property = "totalAmount"),
                    @Result(column = "user_id",property = "userId"),
                    @Result(column = "user_id",property = "user",javaType = UserInfoEntity.class,
                            one=@One(select = "com.lll.feng.mapper.UserInfoMapper.selectById"))
            }
    )
    List<OrderInfoEntity> selectAllOrderAndUser();
}
