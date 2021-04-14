package com.sat.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author zx
 * @date 2021/04/14
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(value = "com.sat.user.mapper")
public class SatUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(SatUserApplication.class);
    }
}
