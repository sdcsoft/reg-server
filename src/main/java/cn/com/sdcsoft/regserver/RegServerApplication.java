package cn.com.sdcsoft.regserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RegServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegServerApplication.class, args);
    }

}
