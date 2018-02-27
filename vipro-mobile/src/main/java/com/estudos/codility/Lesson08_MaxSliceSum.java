package com.estudos.codility;

public class Lesson08_MaxSliceSum {

	// TODO Auto-generated method stub
	public int solution(int[] A) throws Exception {

		int max_ending = A[0];
		int max_slice = A[0];

		for (int i = 1; i < A.length; i++) {
			if (max_ending < 0) {
				max_ending = A[i];
			} else {
				max_ending = max_ending + A[i];
			}
			if (max_ending > max_slice) {
				max_slice = max_ending;
			}
		}

		return max_slice;
	}

	
}
