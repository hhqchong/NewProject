package com.chong;

import com.hua.HelloController;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by hhq on 2019/4/5.
 */
@SpringBootTest(classes = HelloController.class)
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
public class HelloControllerTest {
     @Autowired
     private HelloController helloController;

     @Test
     public void testHello(){
         TestCase.assertEquals("ÄúºÃ£¡Öí",helloController.getHello());
     }
}
