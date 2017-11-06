package com.bolao;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.Main;
import com.vipro.entity.Processo;
import com.vipro.repository.ProcessoRepository;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Main.class)
public class NativeQueryTest {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	ProcessoRepository rep;

	@Test
	public void findById_basic() {

		Processo p = rep.findById(1001L);
		assertEquals("Em andamento", p.getStatus());

	}

	@Test
	@DirtiesContext
	public void deleteById_basic() {

		rep.deleteById(1002L);
		assertNull(rep.findById(1002L));

	}

	@Test
	@DirtiesContext
	public void save_basic() {

		Processo p = rep.findById(1001L);
		assertEquals("Em andamento", p.getStatus());
		p.setStatus("Completo");

		rep.save(p);
		Processo p1 = rep.findById(1001L);
		assertEquals("Completo", p1.getStatus());
		
		

	}
	@Test
	public void playWithEM() {
		
		rep.playWithEM();
	}

}
