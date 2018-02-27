package com.estudos.codility;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Lesson02 {
	
	
	
	@Test
	public void testArray() {
		
		Lesson02Arrays l = new Lesson02Arrays();
		
//		int[] teste = {1,1,3,1,8,9,9,3};
//		
//		assertEquals(l.solution(teste), 8);
//		
//		int[] teste2 = {1};
//		
//		assertEquals(l.solution(teste2), 1);
		
		int[] teste3 = {1,1,3,3,5};
		assertEquals(l.solution2(teste3), 5);
		
		
		
//		Lesson01BinaryGap lesson = new Lesson01BinaryGap();
//	
//		assertEquals(lesson.solution(9), 2);
//		assertEquals(lesson.solution(37), 2);
//		assertEquals(lesson.solution(4177), 5);
		
		
		
	}

}
