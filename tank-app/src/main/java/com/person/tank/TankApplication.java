package com.person.tank;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.person.tank"})
@MapperScan(basePackages = {"com.person.tank.dao"})
public class TankApplication {
    public static void main(String[] args) {
        SpringApplication.run(TankApplication.class,args);
    }
}
