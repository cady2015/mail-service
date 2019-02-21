package com.llj.cloud.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

/**
 * Created by llj on 2019/2/21.
 */
@Slf4j
@Service
public class EmailSenderServiceImpl implements MailService {
    @Autowired
    private JavaMailSender mailSender;
    @Value("${spring.mail.username}")
    private String from;

    @Override
    public void sendSimpleMail(String to,String subject,String content) throws MessagingException {
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        MimeMessageHelper message = new MimeMessageHelper(mimeMessage);
        message.setTo(to);
        message.setSubject(subject);
        message.setText(content);
        message.setFrom(from);
        try {
            mailSender.send(mimeMessage);
            log.info("send email finished!");
        }catch (Exception e){
            log.error("send failed");
            e.printStackTrace();
        }
    }
}
