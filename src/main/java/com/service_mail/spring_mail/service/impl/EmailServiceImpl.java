package com.service_mail.spring_mail.service.impl;

import com.service_mail.spring_mail.service.IEmailService;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements IEmailService {

    private final JavaMailSenderImpl javaMailSender;


    public EmailServiceImpl(JavaMailSenderImpl javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    @Override
    public String sendEmail(String to, String[] cc, String subject, String body) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setCc(cc);
        message.setSubject(subject);
        message.setText(body);

        javaMailSender.send(message);

        return "Mail sent successfully !";
    }
}
