package com.person.tank.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author crowOnThePlane
 * @version 1.0
 * @date 2022/4/21 22:33
 */
@RestController
@RequestMapping("/tank")
public class TankController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
