package com.xys.sample.mapper;

import com.xys.sample.ApplicationTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlGroup;

/**
 * 测试城市查询
 *
 * @author 摇光
 * @version 1.0
 * @Created on 2016/7/27
 * @Copyright 杭州安存网络科技有限公司 Copyright (c) 2016
 */
@SqlGroup({
    @Sql(executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD, scripts = "classpath:initCity.sql"),
    @Sql(executionPhase = Sql.ExecutionPhase.AFTER_TEST_METHOD, scripts = "classpath:deleteCity.sql") })
public class CityMapperTest extends ApplicationTest {

    @Autowired
    CityMapper cityMapper;

    @Test
    public void selectAll() {
        System.out.println(cityMapper.selectAll());
    }
}