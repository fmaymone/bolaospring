package com.estudos.codility;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Toptal3_test {
	
	
	
	@Test
	public void testArray() throws Exception {
		
		Toptal3 l = new Toptal3();

		int[] teste3 = {1,5,4,9,8,7,12,13,14}; 
		
		assertEquals(6, l.solution(teste3));
//		
		
//		Lesson01BinaryGap lesson = new Lesson01BinaryGap();
//	
//		assertEquals(lesson.solution(9), 2);
//		assertEquals(lesson.solution(37), 2);
//		assertEquals(lesson.solution(4177), 5);
		
		
		
	}

}
