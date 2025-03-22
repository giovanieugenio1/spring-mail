package com.service_mail.spring_mail.controller;

import com.service_mail.spring_mail.service.IEmailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    private final IEmailService emailService;

    private static final Logger log = LoggerFactory.getLogger(EmailController.class);

    public EmailController(IEmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping
    public String sendEmail(String to, String[] cc, String subjetc, String body) {
        String result = emailService.sendEmail(to, cc, subjetc, body);
        log.info("Email sent successfully :: ", result);
        return result;
    }
}
