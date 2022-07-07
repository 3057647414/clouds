package com.moc.email.email.server.impl;

import com.moc.email.email.server.sendemail;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.SimpleEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Slf4j
@Service
public class Sendemailimpl implements sendemail {

    @Override
    public boolean send(String to, String msg, String subject) {

        try {
            SimpleEmail email = new SimpleEmail();
// 发送邮件的SMTP服务器，如果不设置，默认查询系统变量mail.smtp.host的值，没有则会抛出异常
// org.apache.commons.mail.EmailException: Cannot find valid hostname for mail session
            email.setHostName("smtp.qq.com");
            email.setSmtpPort(465);
// javax.mail.AuthenticationFailedException: 535 Login fail. Authorization code is expired
            email.setAuthenticator(new DefaultAuthenticator("3057647414@qq.com", "uwekxmdmoelqdced"));
            email.setSSLOnConnect(true);
            email.setFrom("3057647414@qq.com");
            email.setSubject(subject);
            email.setMsg(msg);
            email.addTo(to);
            String send = email.send();
            System.out.println(send);
            log.info("邮件发送成功，内容为：" + msg + "发送给" + to);
            return true;
        } catch (Exception e) {
            log.error("邮件发送失败，错误原因：" + e);
            return false;
        }
    }
}
