package com.lll.feng.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lll.feng.mapper.OrderInfoMapper;
import com.lll.feng.mapper.UserInfoMapper;
import com.lll.feng.pojo.entity.OrderInfoEntity;
import com.lll.feng.pojo.entity.UserInfoEntity;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * mybatis-plus：连表与分页的使用
 */
@Tag(name="mybatis-plus拓展用法")
@RestController
@RequestMapping("/mp/expand")
public class MPExpandController {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Autowired
    private OrderInfoMapper orderInfoMapper;

    @Operation(summary = "mybatis-plus连表查询1对多")
    @GetMapping("/queryAllUserAndOrders")
    public List<UserInfoEntity> queryAllUserAndOrders(){
        return userInfoMapper.selectAllUserAndOrders();
    }

    @Operation(summary = "mybatis-plus连表查询1对1")
    @GetMapping("/queryAllOrderAndUser")
    public List<OrderInfoEntity> queryAllOrderAndUser(){
        return orderInfoMapper.selectAllOrderAndUser();
    }

    @Operation(summary = "mybatis-plus分页")
    @GetMapping("/queryUserByPage")
    public IPage<UserInfoEntity> queryUserByPage(Integer pageIndex,Integer pageSize){
        Page<UserInfoEntity> page = new Page<>(pageIndex,pageSize);
        IPage<UserInfoEntity> iPage = userInfoMapper.selectPage(page, null);
        return iPage;
    }
}
