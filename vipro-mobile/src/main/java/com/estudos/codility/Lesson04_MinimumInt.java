package com.estudos.codility;

import java.util.HashSet;

public class Lesson04_MinimumInt {

	// TODO Auto-generated method stub
	public int solution(int A, int B, int K) throws Exception {

		int counterNumbers = 0;

		for (int i = A; i <= B; i++) {

			if (i % K == 0) {

				counterNumbers++;

			}

		}

		return counterNumbers;

	}

}
