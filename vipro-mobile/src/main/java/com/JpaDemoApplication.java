package com;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import com.bolao.database.jpa.TeamJpaRepository;
import com.bolao.entity.Team;




public class JpaDemoApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	TeamJpaRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	logger.info("Team id 10001 -> {}", repository.findById(10001l).getName());
//		
		logger.info("Inserting -> {}", 
			repository.insert(new Team(1003l, "USA")));
//		
	logger.info("Update 10003 -> {}", 
			repository.update(new Team(10003l, "Pieter")));
//		
//		repository.deleteById(10002);
//
	logger.info("All Teams -> {}", repository.findAll());
	}
}