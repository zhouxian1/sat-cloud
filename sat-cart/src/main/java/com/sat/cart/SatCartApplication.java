package com.leyou.cart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author zx
 * @date 2021/04/14
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SatCartApplication {

    public static void main(String[] args) {
        SpringApplication.run(SatCartApplication.class, args);
    }
}
