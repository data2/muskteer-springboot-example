package com.muskteer.mybatis.annotation.service;

import com.muskteer.mybatis.annotation.bean.Person;

import java.util.List;

/**
 * Created by wanglei on 2018/2/26.
 */
public interface PersonService {

    List<Person> queryAll();
}
