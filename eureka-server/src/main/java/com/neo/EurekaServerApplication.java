package com.neo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

    //运行 EurekaServerApplication，并访问：http://127.0.0.1:8761/
    //这就是注册中心的管理界面，主要看 ：Instances currently registered with Eureka，
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }

}
