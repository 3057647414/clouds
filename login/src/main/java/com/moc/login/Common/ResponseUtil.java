package com.moc.login.Common;

import com.moc.login.Res.resentity;
import com.moc.login.Res.resutil;
import org.springframework.http.ResponseEntity;

public class ResponseUtil {


    /**
     * 成功返回
     *
     * @param object 返回数据
     * @return
     */
    public static resentity successobj(Object object) {
        resentity resp = new resentity<>();
        resp.setResutil(resutil.SUCCESS);
        resp.setDate(object);
        return resp;
    }


    /**
     * 成功返回  无数据
     *
     * @return
     */
    public static resutil success() {
        return resutil.SUCCESS;
    }


    /**
     * 失败返回
     */
    public static resutil error() {
        return resutil.ERROR;
    }

    public static resutil errorpwd() {
        return resutil.ERRORPWD;
    }

    public static resutil errorgander() {
        return resutil.ERRORGANDER;
    }
}