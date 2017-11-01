package com.bolao.database.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
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
	
	public Team update(Team team) {

		return em.merge(team);
		
	}
	
	public Team insert(Team team) {

		return em.merge(team);
		
	}

	public List<Team> findAll() {
		TypedQuery<Team> namedQuery = em.createNamedQuery("find_all_teams", Team.class);
		return namedQuery.getResultList();
	}
	
	public void deleteById(long id) {
		Team team = findById(id);
		em.remove(team);
	}


}
