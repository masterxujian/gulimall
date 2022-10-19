package com.atguigu.gulimall.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@MapperScan("com.atguigu.gulimall.ware.dao")
@SpringBootApplication
public class GuliMallWareApplication {
    public static void main(String[] args) {
        SpringApplication.run(GuliMallWareApplication.class, args);
    }
}
