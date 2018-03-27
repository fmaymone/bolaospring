package com.estudos.codility;

import java.util.Arrays;

public class Toptal3 {
//	
//	Let the length of one side be len_1, and the length
//	of one adjacent side be len_2. For a rectangle with a
//	constant area, the perimeter is minimized when the difference
//	between len_1 and len_2, abs(len_1- len_2), is minimized.

	// TODO Auto-generated method stub
	public int solution(int[] A) throws Exception {

		 //A terceira tu ordena e vê a distância do elemento que deu mismatch
		//para a posição dele. Esse //valor vai ser o tamanho do cluster onde ele vai estar
        int[] mixedArray = A.clone();
        int[] differenceArray = new int[A.length];
        Arrays.sort(A);
        
        for (int i = 0; i < mixedArray.length; i++) {
			
        		differenceArray[i] = A[i] - mixedArray[i];
			
		}
        
        int count = 0;
        for (int i = 0; i < mixedArray.length; i++) {
			
    			if(differenceArray[i] == 0) {
    				
    				count++;
    				
    			}else {
    				
    				int n = differenceArray[i];
    				for (int j = 0; j < differenceArray.length; j++) {
    					if(differenceArray[j] + n == 0) {
    						i=j;
    						count++;
    					}
						
					}
    			}
		
        }
        
        
        
        return count;
        

	}

}
