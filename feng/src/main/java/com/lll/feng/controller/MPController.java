package com.lll.feng.controller;

import com.lll.feng.mapper.UserMapper;
import com.lll.feng.pojo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * mybatis-plus使用
 */
@RestController
@RequestMapping("/mp")
public class MPController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/query")
    public List<User> queryUserList(){
        List<User> users = userMapper.selectUserList();
        return users;
    }

    @GetMapping("/queryById/{userId}")
    public User selectById(@PathVariable Integer userId){
        return userMapper.selectUserById(userId);
    }

    @PostMapping("/save")
    public int save(@RequestBody User user){
        return userMapper.insertUser(user);
    }

    @PutMapping("/change")
    public int changeUser(@RequestBody User user){
        return userMapper.updateUser(user);
    }

    @DeleteMapping("/deleteById/{userId}")
    public int deleteById(@PathVariable Integer userId){
        return userMapper.deleteUserById(userId);
    }

}
