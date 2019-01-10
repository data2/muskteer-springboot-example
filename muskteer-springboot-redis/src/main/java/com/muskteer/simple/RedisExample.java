package com.muskteer.simple;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by wanglei on 2018/2/16.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = RedisExample.class)
public class RedisExample {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void test() {
        ValueOperations<String, String> s = stringRedisTemplate.opsForValue();
        System.out.println(s.get("test"));
    }

}
