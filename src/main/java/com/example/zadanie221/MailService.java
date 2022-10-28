package com.example.zadanie221;

import org.springframework.mail.MailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {

    private MailSender mailSender;

    public MailService(MailSender mailSender) {
        this.mailSender = mailSender;
    }
}
