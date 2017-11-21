package com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import com.bolao.entity.UefaChampionsLeagueCompetition;
import com.bolao.entity.WorldCupCompetition;
import com.bolao.repository.CompetitionRepository;
import com.bolao.repository.PlayerRepository;
import com.bolao.repository.RoundRepository;
import com.bolao.repository.TeamRepository;
import com.vipro.repository.ProcessoRepository;

@SpringBootApplication
public class Main implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());


	@Autowired
	ProcessoRepository repository;


	@Autowired
	PlayerRepository playerRepository;


	

	@Autowired

	TeamRepository teamRepository;

	@Autowired
	RoundRepository roundRepository;

	CompetitionRepository competitionRepository;
	


	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

	@Override
	@Transactional
	public void run(String... arg0) throws Exception {

		

//		competitionRepository.insert(new WorldCupCompetition("Copa 2014", "Messi"));
//		competitionRepository.insert(new UefaChampionsLeagueCompetition("Champions 2012", "Londres"));
		
//		logger.info("Todas as Competiçoes -> {}", competitionRepository.retrieveAllCompetitions());
		
		
		
		


	}

}
