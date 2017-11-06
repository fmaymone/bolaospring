package com.vipro.repository;

import javax.persistence.EntityManager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.vipro.entity.Processo;

@Repository
@Transactional
public class ProcessoRepository {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	EntityManager em;

	public Processo findById(long id) {
		return em.find(Processo.class, id);
	}

	public Processo save(Processo p) {

		if (p.getId() == null) {
			em.persist(p);

		} else {
			em.merge(p);

		}
		return p;

	}

	public void deleteById(long id) {
		Processo p = findById(id);
		if (p != null) {
			em.remove(p);
		}
	}
	public void playWithEM() {
		
		Processo p = findById(1001L);
		
		p.setStatus("Modificando");
		
		
	
		
	}

}
