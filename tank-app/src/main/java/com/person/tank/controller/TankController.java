package com.person.tank.controller;

import com.person.tank.common.ApiResult;
import com.person.tank.pojo.MapDo;
import com.person.tank.pojo.vo.PageResult;
import com.person.tank.service.MapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author crowOnThePlane
 * @version 1.0
 * @date 2022/4/21 22:33
 */
@RestController
@CrossOrigin
@RequestMapping("/tank")
public class TankController {
    @Autowired
    private MapService mapService;

    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }


    @RequestMapping("/upload")
    public ApiResult<String> upload(@RequestBody MapDo map){
        try{
            mapService.upload(map);
            return ApiResult.ok();
        }catch (Exception e){
            return ApiResult.fail(e);
        }
    }

    @RequestMapping("/listPage")
    public ApiResult<PageResult> listPage(int start, int limit){
        try{
            return new ApiResult<>(mapService.listPage(start,limit));
        }catch (Exception e){
            return ApiResult.fail(e);
        }
    }
}
