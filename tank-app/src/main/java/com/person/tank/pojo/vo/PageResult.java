package com.person.tank.pojo.vo;

import com.person.tank.pojo.MapDo;

import java.util.List;

/**
 * @author crowOnThePlane
 * @version 1.0
 * @date 2022/4/23 15:09
 */
public class PageResult {
    private int count;
    private List<MapDo> data;
    private long lastId;
    private boolean end;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<MapDo> getData() {
        return data;
    }

    public void setData(List<MapDo> data) {
        this.data = data;
    }

    public long getLastId() {
        return lastId;
    }

    public void setLastId(long lastId) {
        this.lastId = lastId;
    }

    public boolean isEnd() {
        return end;
    }

    public void setEnd(boolean end) {
        this.end = end;
    }
}
