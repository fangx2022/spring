package com.lll.feng.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 跨域问题是由浏览器的同源策略造成的，浏览器会阻止页面的脚本去访问不同源的资源
 * 不同源：域名、端口、协议不同
 * 域名=主机名+域名后缀  .com商业 .edu教育 .net网络服务 .cn国家地区 .org非盈利组织 
 */
@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")//允许跨域访问的路径
                .allowedOriginPatterns("*")//允许跨域访问的源
                .allowedMethods("POST","GET","PUT","DELETE")//允许请求方法
                .maxAge(16800)//预检间隔时间
                .allowedHeaders("*")//允许头部设置
                .allowCredentials(true);//是否发送cookie
    }
}
