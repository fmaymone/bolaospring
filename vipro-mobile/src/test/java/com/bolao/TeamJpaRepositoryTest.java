package com.bolao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.Main;
import com.bolao.entity.Team;
import com.bolao.repository.jpa.TeamRepositoryJpa;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Main.class)
public class TeamJpaRepositoryTest {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	TeamRepositoryJpa rep;

	@Test
	@Transactional
	public void retrieveSquad_basic() {

		Team t = rep.findOne(1L);
		logger.info("Team é -> {}", t);

	}

	@Test
	@Transactional
	public void saveTeam_basic() {

		Team t = new Team();
		t.setName("Nautico");
		rep.save(t);
		logger.info("Team é -> {}", t);
		t.setName("Sport");
		rep.save(t);
		logger.info("Team é -> {}", t);

	}

	@Test
	@Transactional
	public void findAllTeams() {

		logger.info("Teams é -> {}", rep.findAll());
		logger.info("Count de Teams é -> {}", rep.count());

	}

	@Test
	@Transactional
	public void sort() {

		Sort sort = new Sort(Sort.Direction.ASC, "name");

		logger.info("Sorted Teams é -> {}", rep.findAll(sort));
		logger.info("Count de Teams é -> {}", rep.count());

	}

	@Test
	@Transactional
	public void pagination() {

		PageRequest pageRequest = new PageRequest(0, 3);

		Sort sort = new Sort(Sort.Direction.ASC, "name");

		Page<Team> firstPage = rep.findAll(pageRequest);

		logger.info("Primeira Pagine de  Teams é -> {}", firstPage.getContent());

		Pageable secondPageable = firstPage.nextPageable();
		Page<Team> secondPage = rep.findAll(secondPageable);

		logger.info("Segunda Pagine de  Teams é -> {}", secondPage.getContent());

	}

	@Test
	@Transactional
	public void findByName() {

		//logger.info("findByName -> {}", rep.findByName("Brasil"));

		

	}

}
