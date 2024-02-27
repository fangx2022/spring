package com.lll.feng.controller;

import com.lll.feng.pojo.entity.User;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

/**
 * RestFul是一种请求风格风格，不是规范
 * Http提供了POST(新增、修改资源)、GET(获取资源)、PUT(修改资源)、DELETE(删除资源)等操作对某个web资源进行create/read/update/delete等操作
 * Http状态码：
 * 1xx：信息、通信传输协议级信息
 * 2xx：成功，表示客户端的请求已经成功接收
 * 3xx：重定向，表示客户端必须执行一些其他操作才能完成请求
 * 4xx：客户端错误
 * 5xx：服务器端错误
 */
@Tag(name="RestFul风格使用",description = "RestFul")
@RestController
public class RestFulController {

    /**
     * @PathVariable 获取路径上的参数，而不是获取路径？拼接出来的
     * @param id
     * @return
     */
    @Operation(summary = "根据ID查询用户")
    @GetMapping("/user/query/{id}")
    public String getUserById(@PathVariable int id){
        return "根据ID查询用户";
    }

    @Operation(summary = "新增用户")
    @PostMapping("/user/add")
    public String save(User user){
        return "新增用户";
    }

    @Operation(summary = "修改用户")
    @PutMapping("/user/update")
    public String update(User user){
        return "修改用户";
    }

    @Operation(summary = "根据ID删除用户")
    @DeleteMapping("/user/delete/{id}")
    public String deleteUserById(@PathVariable int id){
        return "根据ID删除用户";
    }
}
