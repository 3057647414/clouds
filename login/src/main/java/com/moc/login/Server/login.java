package com.moc.login.Server;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.moc.login.Common.ResponseUtil;
import com.moc.login.Entity.user;
import com.moc.login.Res.resutil;
import com.moc.login.mapper.usermapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Service
public class login {
    @Autowired
    private usermapper mapper;

    public resutil login(String pwd, String gander, String phone, HttpServletRequest request) {
        QueryWrapper<user> Wrapper = new QueryWrapper<user>();
        Wrapper.eq("phone", phone);
        user users = mapper.selectOne(Wrapper);
        if (users.getPwd().equals(pwd)) {
            if (gander.equals(users.getGander())) {
                request.getSession().setAttribute("user", users);
                return ResponseUtil.success();
            }
            return ResponseUtil.errorgander();
        }
        return ResponseUtil.errorpwd();
    }
}
