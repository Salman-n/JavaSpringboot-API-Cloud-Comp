package com.salman.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class UasccK3520070Application {

    public static void main(String[] args) {
        SpringApplication.run(UasccK3520070Application.class, args);
    }

}
