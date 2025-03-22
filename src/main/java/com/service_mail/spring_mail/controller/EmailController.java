package com.service_mail.spring_mail.controller;

import org.springframework.web.bind.annotation.PostMapping;

public class EmailController {

    @PostMapping
    public String sendEmail(String to, String[] cc, String subjet, String body) {
        return "mail send";
    }
}
