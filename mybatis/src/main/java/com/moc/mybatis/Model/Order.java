package com.moc.mybatis.Model;

import javax.persistence.*;
import lombok.Data;

/**
 * 表名：order
*/
@Data
public class Order {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;

    private String ordernum;

    private Object shopobj;

    private Long shopid;

    private Long phone;

    private String kdnum;

    private String address;

    private String addressto;

    private String accept;

    private String paymethon;
}