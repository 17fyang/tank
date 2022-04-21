package com.person.tank.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

/**
 * @author crowOnThePlane
 * @version 1.0
 * @date 2022/4/21 23:24
 */
public class MapDo implements Serializable {
    @TableId(type = IdType.AUTO)
    private long id;

    private String name;

    private String map;

    public long getId() {
        return id;
    }

    public void setId(long id) {
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
