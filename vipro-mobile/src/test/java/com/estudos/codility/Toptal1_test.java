package com.estudos.codility;

import static org.junit.Assert.assertEquals;

import java.awt.geom.Point2D;

import org.junit.Test;

public class Toptal1_test {
	
	
	
	@Test
	public void testArray() throws Exception {
		
		Toptal1 l = new Toptal1();

		int[] teste3 = {3, 2, -6, 2, 3}; 
		
		//assertEquals(5, l.solution(teste3));
		
		Point2D.Double a = new Point2D.Double(1.0,2.0);
		Point2D.Double b = new Point2D.Double(2.0,4.0);
		Point2D.Double c = new Point2D.Double(-1.0,-2.0);
		Point2D.Double d = new Point2D.Double(-3.0,2.0);
		Point2D.Double e = new Point2D.Double(2.0,-2.0);
		 
		Point2D[] A = {a,b,c,d,e};
		
		assertEquals(l.solution(A),4);
		
		
		
		
		
		
		//assertEquals(l.isAligned(a, b), true);
		
//		
		
//		Lesson01BinaryGap lesson = new Lesson01BinaryGap();
//	
//		assertEquals(lesson.solution(9), 2);
//		assertEquals(lesson.solution(37), 2);
//		assertEquals(lesson.solution(4177), 5);
		
		
		
	}

}
