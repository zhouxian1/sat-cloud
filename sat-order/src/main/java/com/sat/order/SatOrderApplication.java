package com.sat.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author zx
 * @date 2021/04/14
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@MapperScan("com.sat.order.mapper")
public class SatOrderApplication {
    public static void main(String[] args) {
        SpringApplication.run(SatOrderApplication.class, args);
    }
}
