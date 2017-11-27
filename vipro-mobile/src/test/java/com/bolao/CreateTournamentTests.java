package com.bolao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.Main;
import com.bolao.repository.jpa.MatchRepositoryJpa;
import com.bolao.repository.jpa.TeamRepositoryJpa;
import com.bolao.util.CreateCompetition;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Main.class)
public class CreateTournamentTests {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	TeamRepositoryJpa rep;
	
	@Autowired
	MatchRepositoryJpa repMatches;

	@Autowired
	CreateCompetition create;

	@Test
	@Transactional
	@DirtiesContext
	public void creatingCompetition_numberTeamsCreated() {

		create.createTeams();
		create.createMatches();
		assertEquals(rep.findAll().size(), 32);
		assertEquals(repMatches.findAll().size(), 48);




	}



}
