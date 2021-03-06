package com.bolao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.Main;
import com.bolao.repository.RoundRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Main.class)
public class RoundRepositoryTest {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	RoundRepository rep;

	@Test
	@Transactional
	public void retrieveMatchesForRound() {

		logger.info("Matches for Round is {}", rep.getMatchesForRound(1L));

	}

}
