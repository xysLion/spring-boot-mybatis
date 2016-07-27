package com.xys.sample.model;

import javax.persistence.*;

/**
 * 基础信息
 *
 * @author 摇光
 * @version 1.0
 * @Created on 2016/7/27
 * @Copyright 杭州安存网络科技有限公司 Copyright (c) 2016
 */
public class BaseEntity {

    @Id
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Transient
    private Integer page = 1;

    @Transient
    private Integer rows = 10;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("BaseEntity{");
        sb.append("id=").append(id);
        sb.append(", page=").append(page);
        sb.append(", rows=").append(rows);
        sb.append('}');
        return sb.toString();
    }
}
