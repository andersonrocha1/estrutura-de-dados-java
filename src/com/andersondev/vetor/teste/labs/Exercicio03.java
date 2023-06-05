package com.andersondev.vetor.teste.labs;

import com.andersondev.vetor.VetorDinamico;

public class Exercicio03 {

	public static void main(String[] args) {
		
		
		VetorDinamico<String> lista = new VetorDinamico<>(5);
		
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		lista.adiciona("D");
		lista.adiciona("E");
		lista.adiciona("F");
		
		System.out.println(lista);
		
		lista.remove("A");
		
		System.out.println(lista);
		
		lista.remove("E");
		
		System.out.println(lista);
		
		lista.remove("C");
		
		System.out.println(lista);
		
		lista.remove("F");
		
		System.out.println(lista);
		
		/*
		SAÍDA
		
		[A, B, C, D, E, F]
		[B, C, D, E, F]
		[B, C, D, F]
		[B, D, F]
		[B, D]
		
		*/
	}

}
