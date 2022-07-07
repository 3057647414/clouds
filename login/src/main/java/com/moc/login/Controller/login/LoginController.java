package com.moc.login.Controller.login;

import com.moc.login.Res.resutil;
import com.moc.login.Server.login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController

public class LoginController {
    @Autowired
    private login login;

    @RequestMapping("/login")
    public resutil login(HttpServletRequest request, HttpServletResponse response, String phone, String pwd, String token) {
        resutil login = this.login.login(pwd, "1", phone, request);
        return login;
    }
}
