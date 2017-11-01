package com.bolao;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyMathTest {

	@Before
	public void before() {

		System.out.println("Antes");
	}

	@After
	public void after() {

		System.out.println("Depois");
	}
	
	@BeforeClass
	public static void beforeClass() {

		System.out.println("BeforeClass");
	}
	
	@AfterClass
	public static void afterClass() {

		System.out.println("AfterClass");
	}


	@Test
	public void sum_with3numbers() {
		MyMath myMath = new MyMath();
		int resposta = myMath.sum(new int[] { 1, 2, 3 });

		assertEquals(resposta, 6);
	}

}
