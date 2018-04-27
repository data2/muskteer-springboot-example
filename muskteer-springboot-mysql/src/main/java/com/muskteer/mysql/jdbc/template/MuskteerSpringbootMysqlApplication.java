package com.muskteer.mysql.jdbc.template;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SpringBootApplication
public class MuskteerSpringbootMysqlApplication {

	@Autowired
	private PersonRepository personRepository;

	@RequestMapping("/list")
	public List<Person> listUser() {
		List<Person> people=null;
		try {
			people=personRepository.getPersonList();
		}catch (Exception e){
			System.out.println("异常信息:  "+e.getMessage());
		}
		return people;
	}

	public static void main(String[] args) {
		SpringApplication.run(MuskteerSpringbootMysqlApplication.class, args);
	}
}
