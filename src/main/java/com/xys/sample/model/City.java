package com.xys.sample.model;

/**
 * 城市信息
 *
 * @author 摇光
 * @version 1.0
 * @Created on 2016/7/27
 * @Copyright 杭州安存网络科技有限公司 Copyright (c) 2016
 */
public class City extends BaseEntity {

    private String name;

    private String state;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("City{");
        sb.append("name='").append(name).append('\'');
        sb.append(", state='").append(state).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
