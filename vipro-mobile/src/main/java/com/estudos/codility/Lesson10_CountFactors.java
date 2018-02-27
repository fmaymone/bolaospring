package com.estudos.codility;

public class Lesson10_CountFactors {

	// TODO Auto-generated method stub
	public int solution(int N) throws Exception {

		  int numFactors = 0;
			for (int i = 1; i <= (double) Math.sqrt(N); i++) {
				if (N % i == 0) {
					if (i * i != N) {
						numFactors = numFactors + 2;
					} else if (i * i == N) {
						numFactors = numFactors + 1;
					}
				}
			}
			return numFactors;
	}

	
}
