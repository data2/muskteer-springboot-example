package com.muskteer.howtotest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by wanglei on 2018/2/26.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootTestDemo.class)
public class SpringBootTestDemo {

    @Test
    public void test() {
        System.out.println("springboot test");
    }
}
