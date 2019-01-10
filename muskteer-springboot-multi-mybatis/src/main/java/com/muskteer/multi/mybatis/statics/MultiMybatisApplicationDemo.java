package com.muskteer.multi.mybatis.statics;

import com.muskteer.multi.mybatis.statics.mapper.one.OneMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class MultiMybatisApplicationDemo {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MultiMybatisApplicationDemo.class, args);
        OneMapper one = context.getBean(OneMapper.class);
        System.out.println(one.testDSOne());
    }
}
