package com;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import com.bolao.entity.Match;
import com.bolao.entity.Team;
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

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

	@Override
	@Transactional
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		// repository.playWithEM();
		// playerRepository.savePlayerWithSquad();
		Match match1 = new Match();
		Team team1 = teamRepository.findById(1L);
		Team team2 = teamRepository.findById(2L);
		match1.setAway(team1);
		match1.setHome(team2);

		Match match2 = new Match();
		match2.setAway(team2);
		match2.setHome(team1);

		List<Match> matches = new ArrayList();
		matches.add(match1);
		matches.add(match2);

		// roundRepository.addMatchToRound(roundRepository.findById(1L), match1);
		// roundRepository.addMatchToRound(roundRepository.findById(1L), match2);
		roundRepository.addMatchToRound(roundRepository.findById(1L), matches);

	}

}
