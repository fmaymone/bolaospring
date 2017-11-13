package com.estudos.codility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Lesson01BinaryGap {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public int solution(int N) {
		
		String binaryForm = Integer.toBinaryString(N);
		
		int current = 0;
		int max = 0;
		
		for (int i = 0; i < binaryForm.length(); i++) {
			
			String binaryStr = Character.toString(binaryForm.charAt(i));
			

			logger.info(binaryStr);
			
		}
		
		return N;
	}

}
