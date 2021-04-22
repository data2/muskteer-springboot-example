package com.muskteer.rediscache;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by wanglei on 2018/2/26.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = RedisConfig.class)
public class RedisCacheTest {

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void testObject() throws InterruptedException {
        //对象 序列化
        Person person = new Person("testName1111111");
        ValueOperations<String, Person> operations = redisTemplate.opsForValue();
        operations.set("testKey1", person);
//        operations.set("testKey1", person,1, TimeUnit.SECONDS);
//        Thread.sleep(1000);
        //redisTemplate.delete("testKey");
        boolean exists = redisTemplate.hasKey("testKey1");
        if (exists) {
            System.out.println("exists is true");
            System.out.println(operations.get("testKey1").getName());
        } else {
            System.out.println("exists is false");
        }
        // Assert.assertEquals("aa", operations.get("testKey1").getUserName());

    }
}
