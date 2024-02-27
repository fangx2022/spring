package com.lll.feng;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.lll.feng.mapper")
public class FengApplication {

	public static void main(String[] args) {
		SpringApplication.run(FengApplication.class, args);
	}

}
