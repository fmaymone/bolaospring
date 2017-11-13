package com.bolao.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bolao.entity.Competition;

@Repository
@Transactional
public class CompetitionRepository {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	EntityManager em;

	public void insert(Competition competition) {

		em.persist(competition);

	}
	
	public List<Competition> retrieveAllCompetitions(){
		return em.createQuery("SELECT C FROM Competition C", Competition.class).getResultList();
	}

}
