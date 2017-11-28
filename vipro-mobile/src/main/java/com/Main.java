package com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import com.bolao.entity.Round;
import com.bolao.repository.jpa.RoundRepositoryJpa;
import com.bolao.repository.jpa.TeamRepositoryJpa;
import com.bolao.util.Phases;

@SpringBootApplication
public class Main implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

//	@Autowired
//	PlayerRepository playerRepository;
//
//	@Autowired
//	CreateCompetition createCompetition;
//

//
//	@Autowired
//	RoundRepository roundRepository;
//
//	CompetitionRepository competitionRepository;
	
	@Autowired
	RoundRepositoryJpa rep;
	
	@Autowired
	TeamRepositoryJpa teamRepository;
	

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

	@Override
	@Transactional
	public void run(String... arg0) throws Exception {

		//createCompetition.createTeams();
		//createCompetition.createMatches();
		Round r = new Round();
		r.setPhases(Phases.PHASE_2THS);
		rep.save(r);
		
		
		
	}

}
