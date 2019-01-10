package com.muskteer.rediscache;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

/**
 * Created by wanglei on 2018/2/26.
 */
public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Person() {
    }
}
