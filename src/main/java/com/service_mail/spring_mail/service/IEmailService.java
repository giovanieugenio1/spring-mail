package com.service_mail.spring_mail.service;

public interface IEmailService {

    String sendEmail(String to, String[] cc, String subject, String body);

}
