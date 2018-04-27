package com.muskteer.mybatis.annotation;

import com.muskteer.mybatis.annotation.bean.Person;
import com.muskteer.mybatis.annotation.dao.PersonMapper;
import com.muskteer.mybatis.annotation.service.PersonService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SpringBootApplication
public class SpringbootMybatisApplication {

	@Autowired
	private PersonService personService;

	@RequestMapping("/list")
	public List<Person> queryAll(){
		return personService.queryAll();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMybatisApplication.class, args);
	}
}
