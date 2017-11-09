package com.bolao.repository;

import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bolao.entity.Team;

@Repository
@Transactional
public class TeamRepository {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	EntityManager em;

	public Team findById(long id) {
		return em.find(Team.class, id);
	}

	public Team save(Team p) {

		if (p.getId() == null) {
			em.persist(p);

		} else {
			em.merge(p);

		}
		return p;

	}

	public void deleteById(long id) {
		Team p = findById(id);
		if (p != null) {
			em.remove(p);
		}
	}

	

}
