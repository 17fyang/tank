package com.person.tank.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.person.tank.common.AssertUtil;
import com.person.tank.dao.MapDao;
import com.person.tank.pojo.MapDo;
import com.person.tank.pojo.vo.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;


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
        AssertUtil.notNull(map);
        AssertUtil.notNull(map.getName());
        AssertUtil.notNull(map.getMap());

        mapDao.insert(map);
    }

    public PageResult listPage(int start, int limit) {
        QueryWrapper<MapDo> wp = new QueryWrapper<>();
        wp.ge("id", start).last("limit " + limit);

        PageResult result = build(mapDao.selectList(wp));
        result.setEnd(limit == result.getCount());
        return result;
    }

    private PageResult build(List<MapDo> data) {
        PageResult result = new PageResult();
        result.setCount(data.size());
        result.setData(data);
        result.setLastId(data.stream().map(MapDo::getId).max((i1, i2) -> (int) (i1 - i2)).orElse(Long.MAX_VALUE));
        return result;
    }
}
