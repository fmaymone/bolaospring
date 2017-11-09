package com.bolao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.Main;
import com.vipro.entity.Processo;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Main.class)
public class ProcessoRepositoryTest {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	EntityManager em;

	@Test
	public void nativequeries_basic() {

		Query q = em.createNativeQuery("SELECT * FROM PROCESSO", Processo.class);
		List resultList = q.getResultList();
		logger.info("SELECT FROM PROCESSO ->{}", resultList);
	}
	
	@Test
	public void nativequeries_basic_withparameters() {

		Query q = em.createNativeQuery("SELECT * FROM PROCESSO WHERE id = ?", Processo.class);
		q.setParameter(1, 1001L);
		List resultList = q.getResultList();
		logger.info("SELECT FROM PROCESSO HERE ->{}", resultList);
	}
	
	@Test
	public void nativequeries_basic_withnameparameters() {

		Query q = em.createNativeQuery("SELECT * FROM PROCESSO WHERE id = :id", Processo.class);
		q.setParameter("id", 1001L);
		List resultList = q.getResultList();
		logger.info("SELECT FROM PROCESSO WHERE NAMED ->{}", resultList);
	}
	
	@Test
	@Transactional
	public void nativequeries_basic_toupdate() {

		Query q = em.createNativeQuery("UPDATE PROCESSO set LASTUPDATEDDATE = sysdate()", Processo.class);
		int numRowsUpdated = q.executeUpdate();
		logger.info("UPDATE PROCESSO ->{}", numRowsUpdated);
	}



	

}
