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
import com.bolao.entity.Pool;
import com.bolao.entity.User;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Main.class)
public class PoolRepositoryTest {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	EntityManager em;

	@Test
	@Transactional
	public void retrieveUserPools_test() {

		User user = em.find(User.class, 1L);
		logger.info("Usuario -> {}", user);
		logger.info("Pool -> {}", user.getPools());

		Pool pool = em.find(Pool.class, 1L);
		logger.info("Pool -> {}", pool);
		logger.info("Users -> {}", pool.getUsers());

	}
	


}
