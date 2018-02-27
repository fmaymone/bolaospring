package com.bolao.repository;

import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bolao.entity.Pool;
import com.bolao.entity.User;

@Repository
@Transactional
public class UserRepository {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	EntityManager em;

	public void insertUserAndPool(User user, Pool pool) {

		user.addPools(pool);
		pool.addUsers(user);

		em.persist(user);
		em.persist(pool);

	}

}
