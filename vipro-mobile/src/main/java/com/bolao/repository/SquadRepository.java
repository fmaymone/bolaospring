package com.bolao.repository;

import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bolao.entity.Player;
import com.bolao.entity.Squad;

@Repository
@Transactional
public class SquadRepository {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	EntityManager em;

	public Squad findById(long id) {
		return em.find(Squad.class, id);
	}

	public Squad save(Squad p) {

		if (p.getId() == null) {
			em.persist(p);

		} else {
			em.merge(p);

		}
		return p;

	}

	public void deleteById(long id) {
		Squad p = findById(id);
		if (p != null) {
			em.remove(p);
		}
	}

	

}
