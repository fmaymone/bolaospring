package com.bolao.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bolao.entity.Match;
import com.bolao.entity.Round;
import com.bolao.entity.Team;
import com.bolao.repository.jpa.MatchRepositoryJpa;
import com.bolao.repository.jpa.RoundRepositoryJpa;
import com.bolao.repository.jpa.TeamRepositoryJpa;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

@Repository
@Transactional
public class CreateCompetition {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	TeamRepositoryJpa teamRepository;

	@Autowired
	MatchRepositoryJpa matchRepository;

	@Autowired
	RoundRepositoryJpa roundRepository;

	public void createMatches() {

		ObjectMapper mapper = new ObjectMapper();
		TypeReference<List<Match>> mapType = new TypeReference<List<Match>>() {
		};
		InputStream is = TypeReference.class.getResourceAsStream("/matches.json");
		try {
			List<Match> stateList = mapper.readValue(is, mapType);
			for (Match match : stateList) {

				if (isMatchValid(match)) {
					Team home = teamRepository.findBySeedOnCompetition(match.getHome().getSeedOnCompetition()).get(0);
					match.setHome(home);

					Team away = teamRepository.findBySeedOnCompetition(match.getAway().getSeedOnCompetition()).get(0);
					match.setAway(away);

					if (match.getRound() != null) {
						Round round = roundRepository.findByPhase(match.getRound().getPhase());

						match.setRound(round);
					}

					logger.info("Match between {}  AND  {}", home, away);

					matchRepository.saveAndFlush(match);
				} else {

					logger.info("Match not valid {}  ", match);
				}

			}

			logger.info("Match is -> {}", stateList);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

	@Transactional
	public void createTeams() {

		ObjectMapper mapper = new ObjectMapper();
		TypeReference<List<Team>> mapType = new TypeReference<List<Team>>() {
		};
		InputStream is = TypeReference.class.getResourceAsStream("/teams.json");
		try {
			List<Team> stateList = mapper.readValue(is, mapType);

			for (Team team : stateList) {

				teamRepository.saveAndFlush(team);

			}

			logger.info("Team is -> {}", stateList);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

	public boolean isMatchValid(Match match) {
		boolean resposta = false;

		if ((teamRepository.findBySeedOnCompetition(match.getHome().getSeedOnCompetition()).size() > 0)) {
			if ((teamRepository.findBySeedOnCompetition(match.getAway().getSeedOnCompetition()).size() > 0)) {
				return true;
			}
		}
		return resposta;

	}

	public void createRounds() {

		Round r = new Round(Phases.PHASE_2THS);
		r.setTitle("Semi-Finais");
		roundRepository.saveAndFlush(r);

		r = new Round(Phases.PHASE_3RD);
		r.setTitle("Disputa de 3o e 4o lugar");
		roundRepository.saveAndFlush(r);

		r = new Round(Phases.PHASE_4THS);
		r.setTitle("Quartas de Final");
		roundRepository.saveAndFlush(r);

		r = new Round(Phases.PHASE_8THS);
		r.setTitle("Oitavas de Final");
		roundRepository.saveAndFlush(r);

		r = new Round(Phases.PHASE_FINAL);
		r.setTitle("Final");
		roundRepository.saveAndFlush(r);

		r = new Round(Phases.PHASE_FIRST);
		r.setTitle("Primeira Fase");
		roundRepository.saveAndFlush(r);
	}

}
