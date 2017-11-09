package com.bolao.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bolao.entity.Player;
import com.bolao.entity.Squad;

@Repository
@Transactional
public class PlayerRepository {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	EntityManager em;

	public Player findById(long id) {
		return em.find(Player.class, id);
	}

	public Player save(Player p) {

		if (p.getId() == null) {
			em.persist(p);

		} else {
			em.merge(p);

		}
		return p;

	}

	public void deleteById(long id) {
		Player p = findById(id);
		if (p != null) {
			em.remove(p);
		}
	}

	public void savePlayerWithSquad() {
		Squad squad = new Squad(1, "GOLEIRO");
		Player player = new Player("Taffarel");
		
		em.persist(squad);

		player.setSquad(squad);
		
		em.persist(player);

	}

	public Player findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public Player findById(Long id) {
		// TODO Auto-generated method stub
		return em.find(Player.class, id);
	}

	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	public List<Player> findAll() {
		// TODO Auto-generated method stub
		Query query = em.createQuery("SELECT p FROM Player p");
	    return (List<Player>) query.getResultList();
	}

}
