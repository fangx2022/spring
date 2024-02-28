package com.lll.feng.controller;

import com.lll.feng.mapper.UserInfoMapper;
import com.lll.feng.pojo.entity.UserInfoEntity;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * mybatis-plus使用
 */
@Tag(name="mybatis-plus基础用法")
@RestController
@RequestMapping("/mp")
public class MPBaseController {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Operation(summary = "mybatis-plus查询所有")
    @GetMapping("/query")
    public List<UserInfoEntity> queryUserList(){
        //使用mybatis-plus自带方法
        List<UserInfoEntity> userEntities = userInfoMapper.selectList(null);
        return userEntities;
    }

    @Operation(summary = "mybatis-plus查询单个")
    @GetMapping("/queryById/{userId}")
    public UserInfoEntity selectById(@PathVariable Integer userId){
        //使用mybatis-plus自带方法
        return userInfoMapper.selectById(userId);
    }


    /**
     * http://localhost:8888/mp/save
     * @param userInfoEntity
     * @return
     */
    @Operation(summary = "mybatis-plus新增")
    @PostMapping("/save")
    public int save(@RequestBody UserInfoEntity userInfoEntity){
        //使用mybatis-plus自带方法
        return userInfoMapper.insert(userInfoEntity);
    }

    @Operation(summary = "mybatis-plus修改")
    @PutMapping("/change")
    public int changeUser(@RequestBody UserInfoEntity userInfoEntity){
        //使用mybatis-plus自带方法
        return userInfoMapper.updateById(userInfoEntity);
    }

    @Operation(summary = "mybatis-plus删除")
    @DeleteMapping("/deleteById/{userId}")
    public int deleteById(@PathVariable Integer userId){
        //使用mybatis-plus自带方法
        return userInfoMapper.deleteById(userId);
    }

}
