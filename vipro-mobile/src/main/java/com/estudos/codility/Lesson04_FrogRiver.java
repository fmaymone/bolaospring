package com.estudos.codility;

public class Lesson04_FrogRiver {

	// TODO Auto-generated method stub
	public int solution(int X, int[] A) throws Exception {

		try {
			if (A == null || A.length < 0) {
				throw new Exception("Array not permited");
			}
			int sumElementsBefore = 0;
			int destinyIndex = X + 1;
			int[] destinyArray = new int[destinyIndex];
			for (int i = 0; i < A.length; i++) {
				// get the element
				int j = A[i];

				// if the element is less
				if(j < destinyIndex){
					//if the destiny array is already marked. dont put the 1
					if(destinyArray[j] == 0){
						destinyArray[j] = 1;
						sumElementsBefore++;
					}
				}
				//if the sum of the array is fine this is the index
				
				if(sumElementsBefore >= X){
					return i;
				}
				

			}
			

		} catch (Exception e) {
			throw new Exception("Error with the Array", e);
		}
	
	

	
		return -1;

	}

}
