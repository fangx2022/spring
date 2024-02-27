package com.lll.feng.controller;

import com.lll.feng.pojo.entity.User;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@Tag(name="请求参数接收API",description = "参数接收注解用法")
@RestController
public class ParamsController {

    /**
     * 普通请求  GET
     * @param name
     * @param pwd
     * @return
     * 这个时候要想接收到name和pwd有值，则名字也需要对应上  对应不上请看getTest2
     * 请求http://localhost:8888/hello?name=fangxin&pwd=123
     */
    @Operation(summary = "无注解接收参数")
    @RequestMapping(value = "/getTest1",method = RequestMethod.GET)
    public String getTest1(String name,String pwd){
        return "你好!"+name+pwd;
    }

    /**
     * GET
     * @param name
     * @param pwd
     * @return
     * 请求http://localhost:8888/getTest2?username=fangxin&pwd=123
     * 加上@RequestParam就有了映射关系，默认是必填，可以加required=false
     */
    @Operation(summary = "@RequestParam注解接收参数1")
    @RequestMapping(value = "/getTest2",method = RequestMethod.GET)
    public String getTest2(@RequestParam(value = "username",required = false) String name, String pwd){
        return "你好!"+name+pwd;
    }

    /**
     * POST请求 1.参数放在请求体里面  2.也可以拼接  3.如果参数有很多 可以用对象来接收（面向对象思想） 见postTest2
     * @param name
     * @param pwd
     * @return
     * 请求http://localhost:8888/postTest1
     * 加上@RequestParam就有了映射关系，默认是必填，可以加required=false
     */
    @Operation(summary = "@RequestParam注解接收参数2")
    @RequestMapping(value = "/postTest1",method = RequestMethod.POST)
    public String postTest1(@RequestParam(value = "username",required = false) String name, String pwd){
        return "你好!"+name+pwd;
    }

    /**
     * POST请求 1.参数放在请求体里面  2.也可以拼接  3.如果参数有很多 可以用对象来接收（面向对象思想） 见postTest2
     * @return
     * 请求http://localhost:8888/postTest2
     * 加上@RequestParam就有了映射关系，默认是必填，可以加required=false
     */
    @Operation(summary = "对象接收参数")
    @RequestMapping(value = "/postTest2",method = RequestMethod.POST)
    public String postTest2(User user){
        return "你好!"+user.getUsername()+user.getPassword();
    }

    /**
     * POST请求 前段传递的是json类型
     * @return
     * 请求http://localhost:8888/postTest3
     * 加上@RequestParam就有了映射关系，默认是必填，可以加required=false
     */
    @Operation(summary = "@RequestBody请求体接收参数")
    @RequestMapping(value = "/postTest3",method = RequestMethod.POST)
    public String postTest3(@RequestBody User user){
        return "你好!"+user.getUsername()+user.getPassword();
    }
}
