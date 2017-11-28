package com.bolao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.Main;
import com.bolao.entity.Bet;
import com.bolao.entity.Match;
import com.bolao.entity.User;
import com.bolao.repository.jpa.BetRepositoryJpa;
import com.bolao.repository.jpa.MatchRepositoryJpa;
import com.bolao.repository.jpa.UserRepositoryJpa;
import com.bolao.util.CreateCompetition;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Main.class)
public class BetJpaRepositoryTest {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	BetRepositoryJpa repBets;

	@Autowired
	MatchRepositoryJpa repMatches;

	@Autowired
	UserRepositoryJpa repUsers;
	
	@Autowired
	CreateCompetition createCompetition;

	@Before
	@Transactional
	public void createDataForTests(){
		
		createCompetition.createTeams();
		createCompetition.createMatches();
		
		Match match = repMatches.findOne(1L);
		User user = repUsers.findOne(1L);

		Bet bet = new Bet(user, match, 2, 1);
		repBets.saveAndFlush(bet);
		
		
	}
	@Test
	@Transactional
	public void makeBet_basic() {

//		Match match = repMatches.findOne(1L);
		
//
//		Bet bet = new Bet(user, match, 2, 1);
//		repBets.saveAndFlush(bet);
		
		assertEquals(repBets.findByUser(repUsers.findOne(1L)).isEmpty(), false  );
		
		logger.info(repBets.toString());

	}

	@Test
	@Transactional
	public void bet_testPointsFirstRound() {
		
		User user = repUsers.findOne(1L);
		List<Bet> bets = repBets.findByUser(user);
		logger.info("asd");
		

	}

	@Test
	@Transactional
	public void bet_testPointsSecondRound() {

	}

}
