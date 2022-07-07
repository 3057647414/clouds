package com.moc.mybatis.Mapper;

import com.moc.mybatis.Model.Order;
import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.mapper.common.BaseMapper;


@Mapper
public interface OrderMapper extends BaseMapper<Order> {
}