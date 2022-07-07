package com.moc.email.email.bean;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.SimpleEmail;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class bean {
    @Bean
    @Qualifier("email")
    public Email getemailobj() {
        SimpleEmail em = new SimpleEmail();
        return em;
    }
}
