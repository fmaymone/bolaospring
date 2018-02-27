package com.estudos.codility;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Lesson04_FrogRiver_test {
	
	
	
	@Test
	public void testArray() throws Exception {
		
		Lesson04_FrogRiver l = new Lesson04_FrogRiver();

		
		int[] teste3 = {1,3,1,4,2,3,5,4};
		assertEquals(6, l.solution( 5, teste3));
		
		
//		Lesson01BinaryGap lesson = new Lesson01BinaryGap();
//	
//		assertEquals(lesson.solution(9), 2);
//		assertEquals(lesson.solution(37), 2);
//		assertEquals(lesson.solution(4177), 5);
		
		
		
	}

}
