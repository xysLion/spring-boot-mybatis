package com.xys.sample.util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 继承自己的MyMapper
 *
 * @author 摇光
 * @version 1.0
 * @Created on 2016/7/27
 * @Copyright 杭州安存网络科技有限公司 Copyright (c) 2016
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
    //TODO
    //FIXME 特别注意，该接口不能被扫描到，否则会出错
}