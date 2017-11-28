package com.bolao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.Main;
import com.bolao.entity.Bet;
import com.bolao.entity.Match;
import com.bolao.entity.User;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Main.class)
public class MatchWinnerTest {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	
	@Test
	@Transactional
	public void winner_basic() {

		Match match = new Match();
		match.setScoreAway(1);
		match.setScoreHome(2);
		assertEquals(match.getResultRegularTime(), 1);
		match.setScoreAway(3);
		assertEquals(match.getResultRegularTime(), 2);
		match.setScoreHome(3);
		assertEquals(match.getResultRegularTime(), 0);
	
		

	}

	@SuppressWarnings("deprecation")
	@Test
	@Transactional
	public void bet_testPointsFirstRound() {
		Match match = new Match();
		match.setScoreHome(2);
		match.setScoreAway(1);
		
		
		Bet bet = new Bet(new User(), match, 2, 1);
		assertEquals(bet.calculatePointsMatch(),6, 0.1);
		
		bet = new Bet(new User(), match, 2, 0);
		assertEquals(bet.calculatePointsMatch(),4.5,0.1);
		
		bet = new Bet(new User(), match, 3, 1);
		assertEquals(bet.calculatePointsMatch(),4.5,0.1);
		
		bet = new Bet(new User(), match, 1, 1);
		assertEquals(bet.calculatePointsMatch(),0,0.1);
		
		match = new Match();
		match.setScoreAway(2);
		match.setScoreHome(2);
		bet = new Bet(new User(), match, 2, 1);
		assertEquals(bet.calculatePointsMatch(),0,0.1);
		
	
		
		bet = new Bet(new User(), match, 2, 2);
		assertEquals(bet.calculatePointsMatch(),6,0.01);
		
		bet = new Bet(new User(), match, 0, 0);
		assertEquals(bet.calculatePointsMatch(),4,0.1);
		
		bet = new Bet(new User(), match, 0, 1);
		assertEquals(bet.calculatePointsMatch(),0,0.1);
		
		bet = new Bet(new User(), match, 0, 2);
		assertEquals(bet.calculatePointsMatch(),0,0.1);
		
		match = new Match();
		match.setScoreHome(1);
		match.setScoreAway(2);
		
		bet = new Bet(new User(), match, 2, 3);
		assertEquals(bet.calculatePointsMatch(),3,0.1);
		
		bet = new Bet(new User(), match, 0, 1);
		assertEquals(bet.calculatePointsMatch(),3,0.1);
		
		bet = new Bet(new User(), match, 1, 2);
		assertEquals(bet.calculatePointsMatch(),6,0.1);
		
		bet = new Bet(new User(), match, 0, 2);
		assertEquals(bet.calculatePointsMatch(), 4.5,0.1);
		
		bet = new Bet(new User(), match, 1, 3);
		assertEquals(bet.calculatePointsMatch(), 4.5,0.1);
		
		bet = new Bet(new User(), match, 1, 1);
		assertEquals(bet.calculatePointsMatch(), 0,0.1);
		
		bet = new Bet(new User(), match, 1, 0);
		assertEquals(bet.calculatePointsMatch(), 0,0.1);
		
		
		
		

	}

	

}
