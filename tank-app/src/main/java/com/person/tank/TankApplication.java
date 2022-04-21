package com.person.tank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.person.tank"})
public class TankApplication {
    public static void main(String[] args) {
        SpringApplication.run(TankApplication.class,args);
    }
}
