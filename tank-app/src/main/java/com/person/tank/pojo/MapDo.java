package com.person.tank.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * @author crowOnThePlane
 * @version 1.0
 * @date 2022/4/21 23:24
 */
@TableName("map")
public class MapDo implements Serializable {
    @TableId(type = IdType.AUTO)
    private Long id;

    private String name;

    private String map;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }
}
