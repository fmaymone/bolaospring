package com.bolao.database.jpa;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.bolao.entity.Team;

@Repository
@Transactional
public class TeamJpaRepository {
	
	@PersistenceContext
	EntityManager em;
	
	public Team findById(long id) {
		
		return em.find(Team.class, id);
	}

}
