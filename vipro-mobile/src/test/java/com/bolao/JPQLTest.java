package com.bolao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.Main;
import com.vipro.entity.Processo;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Main.class)
public class JPQLTest {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	EntityManager em;

	@Test
	public void jpql_basic() {

		List resultList = em.createQuery("SELECT p from Processo p").getResultList();
		logger.info("SELECT p from PROCESSO p -> {}", resultList);
	}

	@Test
	public void jpql_typed() {
		TypedQuery<Processo> query = em.createQuery("SELECT p from Processo p", Processo.class);
		List resultList = query.getResultList();
		logger.info("SELECT p from PROCESSO typed p -> {}", resultList);
	}

	

}
