package com.estudos.codility;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Lesson06_Distinct {

	// TODO Auto-generated method stub
	public int solution(int[] A) throws Exception {
		
		Logger logger = LoggerFactory.getLogger(this.getClass());

		Math.abs(2);
		Arrays.sort(A);
		int count = 0;

		if (A.length > 1) {
			count++;
			for (int i = 1; i <= A.length -1 ; i++) {
				logger.info("indice {} com A[i] = {} e A[i-1] = {}", i, A[i], A[i-1]);
				if (A[i - 1] != A[i]) {
					count++;
				}

			}

		
		}
		return count;

	}
}
