package com.estudos.codility;

import java.util.Arrays;

public class Toptal2 {
//	
//	Let the length of one side be len_1, and the length
//	of one adjacent side be len_2. For a rectangle with a
//	constant area, the perimeter is minimized when the difference
//	between len_1 and len_2, abs(len_1- len_2), is minimized.

	// TODO Auto-generated method stub
	public int solution(int []A) throws Exception {

		if(A.length <= 0){
		     
		     return -1;
		 }     
		Arrays.sort(A);
		    
		    int answer = 0;
		    int local = -1;
		    int count = 0;
		    for (int i = 0; i < A.length - 1; i++) {
		        if ( A[i + 1] - A[i] < 2 && local == -1 ) {
		        	local = A[i + 1] - A[i];    
		        	count = 2;
		            
		        } else if (A[i + 1] - A[i] <= 1 && local == 0  ) {
		            count++;
		            local = A[i + 1] - A[i];
		        } else if (A[i + 1] - A[i] == 0 && local == 1  ) {
		            count++;
		        } else {
		        	
		        	answer = Math.max(answer, count);
		        	count = 0;
		        	local = -1;
		            
		            
		        }
		    }
		    return answer;

	}

}
