package com.muskteer.dubbo.server.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.muskteer.dubbo.api.PersonService;

/**
 * Created by wanglei on 2018/2/27.
 */
@Service(version = "1.0.0")
public class PersonServiceImpl  implements PersonService {
    @Override
    public void call() {
        System.out.println("call done.");
    }
}
