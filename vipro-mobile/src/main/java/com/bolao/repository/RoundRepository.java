package com.bolao.repository;

import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bolao.entity.Match;
import com.bolao.entity.Round;

@Repository
@Transactional
public class RoundRepository {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	EntityManager em;
	
	@Transactional
	public void addMatchToRound(Round round, Match match) {
		em.persist(match);
		round.addMatch(match);
		em.persist(round);
		
		
		
	}
	
	public Round findById(long id) {
		return em.find(Round.class, id);
	}

}
