package com.estudos.codility;

public class Lesson10_MinimumPerimeter {
//	
//	Let the length of one side be len_1, and the length
//	of one adjacent side be len_2. For a rectangle with a
//	constant area, the perimeter is minimized when the difference
//	between len_1 and len_2, abs(len_1- len_2), is minimized.

	// TODO Auto-generated method stub
	public int solution(int N) throws Exception {

		int minPer = Integer.MAX_VALUE;

		  for(int i = 1; i*i <= N; i++){
			  //i é uma aresta
			  //N/i é a outra
		    if(N % i == 0){
		      minPer = Math.min(minPer, 2*(N/i + i));
		    }
		  }

		  return minPer;

	}

}
