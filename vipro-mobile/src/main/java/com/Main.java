package com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import com.bolao.repository.CompetitionRepository;
import com.bolao.repository.PlayerRepository;
import com.bolao.repository.RoundRepository;
import com.bolao.repository.TeamRepository;
import com.bolao.util.CreateCompetition;

@SpringBootApplication
public class Main implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PlayerRepository playerRepository;

	@Autowired
	CreateCompetition createCompetition;

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

		createCompetition.createTeams();
		createCompetition.createMatches();
		
	}

}
