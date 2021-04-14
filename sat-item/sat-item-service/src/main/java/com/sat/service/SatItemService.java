package com.sat.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author zx
 * @date 2021/04/14
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.sat.service.mapper")
public class SatItemService {

    public static void main(String[] args) {
        SpringApplication.run(SatItemService.class);
    }
}
