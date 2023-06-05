package com.andersondev.vetor.teste.labs;

import com.andersondev.vetor.VetorDinamico;

public class Exercicio05 {

	public static void main(String[] args) {
	
		VetorDinamico<String> lista = new VetorDinamico<>(5);
		
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		lista.adiciona("D");
		lista.adiciona("E");
		lista.adiciona("F");
		
		System.out.println(lista.obtem(0));
		System.out.println(lista.obtem(2));
		System.out.println(lista.obtem(5));
		System.out.println(lista.obtem(3));
		System.out.println(lista.obtem(1));
		System.out.println(lista.obtem(4));
		System.out.println(lista.obtem(6));//posicao não existe
		
		
		/*
		SAÍDA
		A
		C
		F
		D
		B
		E
		
		Exception in thread "main" java.lang.IllegalArgumentException: Posição Inválida!
		
		
		*/

	}

}
