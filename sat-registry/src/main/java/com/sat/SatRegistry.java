package com.sat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author zx
 * @date 2021/04/14
 */
@SpringBootApplication
@EnableEurekaServer
public class SatRegistry {

    public static void main(String[] args) {
        SpringApplication.run(SatRegistry.class);
    }
}
