package com.estudos.codility;


import java.util.HashSet;

class Point2D {
	  public int x;
	  public int y;

}
public class Toptal1 {
//	
//	Let the length of one side be len_1, and the length
//	of one adjacent side be len_2. For a rectangle with a
//	constant area, the perimeter is minimized when the difference
//	between len_1 and len_2, abs(len_1- len_2), is minimized.

	// TODO Auto-generated method stub
	public int solution(Point2D[] A) {

	
	if(A.length < 0) {
		return 0;
	}
	
	 HashSet firstQuad = new HashSet();
	 HashSet secQuad = new HashSet();
	 HashSet thirdQuad = new HashSet();
	 HashSet forthQuad = new HashSet();
	 
	for (int i = 0; i < A.length; i++) {
		
		Point2D temp = A[i];
		//first
		if(temp.x >=0 && temp.y >=0) {
			firstQuad.add((temp.x/temp.y));
			
		}
		//sec
		if(temp.x <=0 && temp.y >=0) {
			secQuad.add((temp.x/temp.y));
		}
		//third
		if(temp.x <=0 && temp.y <=0) {
			thirdQuad.add((temp.x/temp.y));
		}
		//forth
		if(temp.x >=0 && temp.y <=0) {
			forthQuad.add((temp.x/temp.y));
			
		}
		
		
		
		
	}
	
		
	return firstQuad.size() + secQuad.size() + thirdQuad.size() + forthQuad.size();
	 
	


		  

	}
	
	public boolean isAligned(Point2D a, Point2D b) {
		boolean resposta = false;
		
		if(a.x/a.y == b.x/b.y) {
			return true;
		}
		
		return false;
	}

}
