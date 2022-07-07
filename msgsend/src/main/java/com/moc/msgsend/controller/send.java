package com.moc.msgsend.controller;

import com.moc.msgsend.dao.senddao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class send {
    @Autowired
    private senddao send;
    @RequestMapping("/send")
    public Object sendmsg(String phone){
        String s = send.doGet("http://qie.gm818.com/index.php/Home/Public/send_phone_code.html?phone="+phone);
        return s;

    }
}
