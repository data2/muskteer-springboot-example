package com.muskteer.spring.boot.hibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        ConfigurableApplicationContext c = SpringApplication.run(App.class, args);
        System.out.println("start");
        ((DaoImpl)c.getBean("daoImpl")).test();
        System.out.println("end");
    }

}

