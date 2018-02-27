package com.estudos.codility;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Lesson02ArraysRotation_test {
	
	
	
	@Test
	public void testArray() {
		
		Lesson02ArraysRotation l = new Lesson02ArraysRotation();
		
//		int[] teste = {1,1,3,1,8,9,9,3};
//		
//		assertEquals(l.solution(teste), 8);
//		
//		int[] teste2 = {1};
//		
//		assertEquals(l.solution(teste2), 1);
		
//		int[] teste = {1,1,3,3,5};
//		int[] resposta = {5,1,1,3,3};
//		assertEquals(l.solution(teste, 1), [5,1,1,3,3]);
//		
//		int[] teste2 = {1,2,3,4};
//		int[] resposta2 = {3,4,1,2};
//		assertEquals(l.solution(teste2, 2), resposta2);
		
		int[] teste2 = {1,2,3,4};
		int[] resposta2 = {3,4,1,2};
		assertEquals(l.solution(teste2, 5), resposta2);
		
		
		
		
//		Lesson01BinaryGap lesson = new Lesson01BinaryGap();
//	
//		assertEquals(lesson.solution(9), 2);
//		assertEquals(lesson.solution(37), 2);
//		assertEquals(lesson.solution(4177), 5);
		
		
		
	}

}
