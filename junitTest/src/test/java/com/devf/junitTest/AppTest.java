package com.devf.junitTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { AppTest.class })//, Config.class
@TestPropertySource(locations = {"classpath:/config/config.properties"})//, properties = {"foo=bar", "env=test"}
public class AppTest {
    @Autowired
    private Environment env;

    @Test
    public void testProperties() {
        System.out.println(env.getProperty("message"));
        System.out.println(env.getProperty("foo"));
    }
    @Test
    public void testProperties2() {
        System.out.println(env.getProperty("message"));
        System.out.println(env.getProperty("foo"));
    }
}
