package com.bolao;

import javax.persistence.EntityManager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.Main;
import com.bolao.entity.Player;
import com.bolao.entity.Squad;
import com.bolao.repository.PlayerRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Main.class)
public class PlayerRepositoryTest {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PlayerRepository rep;
	
	@Autowired
	EntityManager em;

	@Test
	public void retrieveSquad_basic() {
		
		Player p = em.find(Player.class,1L);
		logger.info("Player é -> {}", p);
		Squad s = p.getSquad();
		logger.info("Squad é -> {}", s);
		
		

		
	}
	


	

}
