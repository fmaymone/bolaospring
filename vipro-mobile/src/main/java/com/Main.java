package com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bolao.entity.Match;
import com.bolao.repository.PlayerRepository;
import com.bolao.repository.RoundRepository;
import com.vipro.repository.ProcessoRepository;

@SpringBootApplication
public class Main implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	ProcessoRepository repository;
	

	@Autowired
	PlayerRepository playerRepository;
	
	@Autowired
	RoundRepository roundRepository;

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub	
		//repository.playWithEM();
		//playerRepository.savePlayerWithSquad();
		Match match1 = new Match();
		Match match2 = new Match();
		
		
		
		
		

	}

}
