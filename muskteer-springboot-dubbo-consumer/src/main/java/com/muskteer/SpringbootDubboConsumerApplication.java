package com.muskteer;

import com.muskteer.dubbo.client.service.PersonConsumerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootDubboConsumerApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext envi = SpringApplication.run(SpringbootDubboConsumerApplication.class, args);
		PersonConsumerService bean = envi.getBean(PersonConsumerService.class);
		bean.getRemotePersonService();
	}
}
