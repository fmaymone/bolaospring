package com.bolao;

import static org.junit.Assert.assertNotNull;

import java.util.List;

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
import com.bolao.entity.Round;
import com.bolao.repository.jpa.RoundRepositoryJpa;
import com.bolao.util.Phases;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Main.class)
public class PhasesTest {
	
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private RoundRepositoryJpa rep;

	
	@Test
	@Transactional
	@DirtiesContext
	public void testEnum_phase() {
		
	}

}
