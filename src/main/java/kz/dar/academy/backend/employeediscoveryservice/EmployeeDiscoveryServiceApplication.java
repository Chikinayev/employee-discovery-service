package kz.dar.academy.backend.employeediscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EmployeeDiscoveryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeDiscoveryServiceApplication.class, args);
    }

}
