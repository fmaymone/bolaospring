package com.estudos.codility;

public class Lesson02ArraysRotation {
	
	public int[] solution(int[] A, int K){
		
		int edge = 0;
		int lenght = A.length;
		int[] resposta = new int[lenght];
		
		//calcular o edge se K > lenght
		if(K > lenght){
			
			edge = K%lenght;
			
		}else{
			edge = K;
		}
		
		int variacao = lenght - edge;
		
		for (int i = 0; i < A.length; i++) {
			int j = A[i];
			
			if(i < (lenght - edge )){
				
				resposta[i+edge]=A[i];
				
			}else{
				
				resposta[i-variacao]=A[i];
			}
			
			
		}
		//Se indice do array <= edge
		// novo array = indice + edge
		//senao novo = indice - [tamanho - edge]
		
		
		return resposta;
	}

}
