package com.estudos.codility;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Lesson08_MaxSliceSum_test {
	
	
	
	@Test
	public void testArray() throws Exception {
		
		Lesson08_MaxSliceSum l = new Lesson08_MaxSliceSum();

		int[] teste3 = {3, 2, -6, 2, 3}; 
		
		assertEquals(5, l.solution(teste3));
//		
		
//		Lesson01BinaryGap lesson = new Lesson01BinaryGap();
//	
//		assertEquals(lesson.solution(9), 2);
//		assertEquals(lesson.solution(37), 2);
//		assertEquals(lesson.solution(4177), 5);
		
		
		
	}

}
