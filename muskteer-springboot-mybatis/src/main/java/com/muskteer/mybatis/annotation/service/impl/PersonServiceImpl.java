package com.muskteer.mybatis.annotation.service.impl;

import com.muskteer.mybatis.annotation.bean.Person;
import com.muskteer.mybatis.annotation.dao.PersonMapper;
import com.muskteer.mybatis.annotation.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wanglei on 2018/2/26.
 */
@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonMapper personMapper;

    @Override
    public List<Person> queryAll() {
        return personMapper.queryAll();
    }
}
