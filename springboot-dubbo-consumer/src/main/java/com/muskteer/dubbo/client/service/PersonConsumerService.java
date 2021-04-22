package com.muskteer.dubbo.client.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.muskteer.dubbo.api.PersonService;
import org.springframework.stereotype.Component;

/**
 * Created by wanglei on 2018/2/27.
 */
@Component
public class PersonConsumerService {

    @Reference(version = "1.0.0")
    PersonService personService;

    public void getRemotePersonService() {
        System.out.println("begin call remote personservice.");
        personService.call();
        System.out.println("call remote personservice finish.");

    }


}
