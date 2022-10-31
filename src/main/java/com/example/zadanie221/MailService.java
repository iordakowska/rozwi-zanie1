package com.example.zadanie221;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.EventRecodingLogger;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Service
public class MailService {
    private JavaMailSender javaMailSender;
    private static final String SENDER = "forsale1@op.pl";

    public MailService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    public void sendMail(FormDto dto) {

        try{
            MimeMessage mimeMessage = javaMailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, "utf-8");
            helper.setTo(dto.getReceiver());
            helper.setFrom(SENDER);
            helper.setSubject(dto.getTitle());
            helper.setText(dto.getContent(), true);

            javaMailSender.send(mimeMessage);

        } catch(MessagingException e) {
            e.printStackTrace();
        }
    }
}
