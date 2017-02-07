package com.panlingxiao.spring.profile.test;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.panlingxiao.spring.profile.service.HelloService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-profile.xml")
/*
 * 使用注册来完成对profile的激活,
 * 传入对应的profile名字即可,可以传入produce或者dev
 */
@ActiveProfiles("produce")
public class TestActiveProfile {

    @Autowired
    private HelloService hs;

    @Test
    public void testProfile() throws Exception {
        String value = hs.sayHello();
        System.out.println(value);
    }
}