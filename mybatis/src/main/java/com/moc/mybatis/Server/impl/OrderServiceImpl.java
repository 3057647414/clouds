/**
* @mbg.generated
* generator on Wed Jul 06 09:08:25 CST 2022
*/
package com.moc.mybatis.Server.impl;

import com.moc.mybatis.Mapper.OrderMapper;
import com.moc.mybatis.Model.Order;
import com.moc.mybatis.Server.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper mapper;
    public List select(Order o){
        List<Order> select = mapper.select(o);
        return select;
    }
}