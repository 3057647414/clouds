package com.moc.mybatis.Controller;

import com.moc.mybatis.Mapper.OrderMapper;
import com.moc.mybatis.Model.Order;
import com.moc.mybatis.Server.impl.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

@RestController
@RequestMapping("/test")
public class test {
    @Autowired
    private OrderServiceImpl im;
    public Object test() throws IOException {
        Order o=new Order();
        o.setId(1l);
        List select = im.select(o);
//        return select;
        URL url = new URL("http://qie.gm818.com/index.php/Home/Public/send_phone_code.html?phone=18084148199");
        URLConnection urlConnection = url.openConnection();
        urlConnection.connect();
        return null;
    }
}
