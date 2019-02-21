package com.llj.cloud;

import com.llj.cloud.service.MailService;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by llj on 2019/2/21.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class EmailSenderServiceImplTest extends TestCase {

    @Autowired
    private MailService mailService;
    @Test
    public void testSendSimpleMail() throws Exception {
        String to = "771987573@qq.com";
        String subject = "Hello baby";
        String content = "爱老虎油";
        for (int i=0;i<100;i++){
            mailService.sendSimpleMail(to,subject,"大声喊出100遍："+content+i);
        }

    }
}