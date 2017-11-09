package com.bolao;

import javax.persistence.EntityManager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

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
	@Transactional
	public void retrieveSquad_basic() {

		Player p = em.find(Player.class, 1L);
		logger.info("Player é -> {}", p);
		Squad s = p.getSquad();
		logger.info("Squad é -> {}", s);

	}
	@Test
	@Transactional
	public void retrieveSquad_bidirectional() {

		Squad s = em.find(Squad.class, 1L);
		logger.info("Squad é -> {}", s);
		
		Player p = s.getPlayer();
		logger.info("Player é -> {}", p);

	}

	@Test
	//@Transactional // ao criar um transactional é criado um Persistence Context SE EU RETIRAR o transactional
	public void someTest() {

		Player p = em.find(Player.class, 1L);
		//Nesse momento o Persistence Context tem um Player 
		// Se eu retirar o Transactional quando eu der o find eu abro e fecho uma transação
		Squad s = p.getSquad();
		//Nesse momento o Persistence Context tem um Squad e um Player
		//Entao, sem o transactional, ao eu dar esse getSquad eu tenho uma exceção
		s.setNum(15);
		//Nesse momento o Persistence Context tem um Squad ++ e um Player
		p.setName("Kruyff");
		//Nesse momento o Persistence Context tem um Squad ++ e um Player ++

	}

}
