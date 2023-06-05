package com.andersondev.vetor.teste;

import com.andersondev.vetor.Vetor;

public class AulaVetor03 {

	public static void main(String[] args) {
		
		Vetor vetor = new Vetor(10);
		
		vetor.adiciona("elemento 1");
		vetor.adiciona("elemento 2");
		vetor.adiciona("elemento 3");
		
		System.out.println(vetor.tamaho());
		
		System.out.println(vetor);
		

	}

}
