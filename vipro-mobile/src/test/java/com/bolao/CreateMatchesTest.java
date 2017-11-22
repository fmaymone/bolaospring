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
import com.bolao.util.CreateCompetition;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Main.class)
public class CreateMatchesTest {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	CreateCompetition createCompetition;
	

	@Test
	@Transactional
	public void createMatches() {
		
		createCompetition.createTeams();

	

	}
	

}
