package com.estudos.codility;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Lesson02Arrays {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public int solution(int A[]) {

		// ordena
		Arrays.sort(A);
		logger.debug(A.toString());
		logger.debug(A.toString());
		int resposta = -1;
		
		if (A.length == 1) {
			resposta =  A[0];
		} else {
			for (int i = 1; i < A.length; i++) {

				int actual = A[i];
				int prev = A[i - 1];

				// se nao eh o ultimo
				if (i != A.length -1) {
					
					int next = A[i + 1];
					// é igual ao anterior? // faz nada
					// se nao for checa se eh igual ao proximo
					if (actual != prev && actual != next) {

						return actual;

					}

				} else {

					// se o ultimo nao for igual ao anterior, eh ele
					if (actual != prev) {

						return actual;
					}
				}

			}

			
		}

		// se é igual anda
		// se nao for verifica se eh igual ao proximo
		// se for o ultimo elemento e nao for igual ao anterior é ele
		return resposta;
	
	}
	
	int solution2(int[] array){
		
		 if (array == null)
	            throw new NullPointerException("Argument array null");

	        Map<Integer, Integer> ocurrences = new HashMap<>();

	        for (int i = 0; i < array.length; i++) {
	            Integer previous = ocurrences.put(array[i], 1);
	            if (previous != null) {
	                ocurrences.put(array[i], previous.intValue() + 1);
	            }
	        }

	        Iterator<Integer> iteratorKeys = ocurrences.keySet().iterator();
	        boolean found = false;
	        Integer one = new Integer(1);
	        Integer key = null;
	        while (iteratorKeys.hasNext() && !found) {
	            key = iteratorKeys.next();
	            found = one.equals(ocurrences.get(key));
	        }

	        if (found) {
	            return key;
	        } else {
	            throw new IllegalArgumentException("Argument array doesn't contain an unpaired element ");
	        }
	    }
		
		
	
}