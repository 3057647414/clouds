package com.moc.login.Res;

import lombok.Data;

public enum resutil {
    SUCCESS("1000", "成功"),
    ERRORPWD("1001", "密码错误"),
    ERROR("1004", "失败"),
    ERRORNAME("1002", "账号未注册"),
    ERRORGANDER("1003", "权限不足");


    resutil(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private String code;
    private String msg;
}
