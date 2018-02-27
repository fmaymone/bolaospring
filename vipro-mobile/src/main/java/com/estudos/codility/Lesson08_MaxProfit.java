package com.estudos.codility;

public class Lesson08_MaxProfit {

	// TODO Auto-generated method stub
	public int solution(int[] A) throws Exception {

		
		
			if(A.length == 1 || A.length == 0){
		        return 0;
		    }
		    
		    int maxSoFar = 0;
		    int maxEndingHere = 0;
		    int minPrice = A[0];
		    
		    for(int i = 1; i < A.length; i++){
		        maxEndingHere = Math.max(0, A[i] - minPrice);
		        minPrice = Math.min(minPrice, A[i]);
		        maxSoFar = Math.max(maxEndingHere, maxSoFar);
		    }
		    
		    return maxSoFar;
		

		
	}

	
}
