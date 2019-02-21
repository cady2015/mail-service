package com.llj.cloud.service;

import javax.mail.MessagingException;

/**
 * Created by llj on 2019/2/21.
 */
public interface MailService {

    void sendSimpleMail(String to, String subject, String content) throws MessagingException;
}
