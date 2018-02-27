package com.estudos.codility;

public class Lesson08_MaxSliceSum {

	// TODO Auto-generated method stub
	public int solution(int[] A) throws Exception {
		
		int max_ending = 0, max_slice = 0;
		
		for (int i = 0; i < A.length; i++) {
			
			max_ending = Math.max(0, max_ending + A[i]);
			max_slice = Math.max(max_slice, max_ending);
			
		}
		
		return max_slice;

	}

	private int max(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}
}
