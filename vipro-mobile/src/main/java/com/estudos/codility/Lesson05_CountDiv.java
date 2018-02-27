package com.estudos.codility;

import java.util.HashSet;

public class Lesson05_CountDiv {

	// TODO Auto-generated method stub
	public int solution(int[] A) throws Exception {

		int num = 1;
		HashSet<Integer> hset = new HashSet<Integer>();

		for (int i = 0; i < A.length; i++) {
			hset.add(A[i]);
		}

		while (hset.contains(num)) {
			num++;
		}

		return num;
	}


}
