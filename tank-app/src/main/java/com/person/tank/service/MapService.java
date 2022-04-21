package com.person.tank.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.person.tank.dao.MapDao;
import com.person.tank.pojo.MapDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author crowOnThePlane
 * @version 1.0
 * @date 2022/4/21 23:30
 */
@Service
public class MapService {

    @Autowired
    private MapDao mapDao;

    public void upload(MapDo map) {
        assert map != null;
        assert map.getName() != null;
        assert map.getMap() != null;

        mapDao.insert(map);
    }

    public List<MapDo> listPage(int start, int limit) {
        QueryWrapper<MapDo> wp = new QueryWrapper<>();
        wp.ge("id", start).last("limit " + limit);

        return mapDao.selectList(wp);
    }
}
