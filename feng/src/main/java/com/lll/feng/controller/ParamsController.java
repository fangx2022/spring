package com.lll.feng.controller;

import com.lll.feng.pojo.entity.User;
import org.springframework.web.bind.annotation.*;

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
    @RequestMapping(value = "/postTest2",method = RequestMethod.POST)
    public String postTest2(User user){
        return "你好!"+user.getUsername()+user.getPwd();
    }

    /**
     * POST请求 前段传递的是json类型
     * @return
     * 请求http://localhost:8888/postTest3
     * 加上@RequestParam就有了映射关系，默认是必填，可以加required=false
     */
    @RequestMapping(value = "/postTest3",method = RequestMethod.POST)
    public String postTest3(@RequestBody User user){
        return "你好!"+user.getUsername()+user.getPwd();
    }
}
