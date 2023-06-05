package com.andersondev.vetor.teste.labs;

import com.andersondev.vetor.VetorDinamico;

public class Exercicio01 {

	public static void main(String[] args) {
		
		VetorDinamico<String> lista = new VetorDinamico<>(5);
		
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		
		System.out.println(lista);
		
		System.out.println(lista.contem("A"));
		System.out.println(lista.contem("D"));
		System.out.println(lista.contem("B"));
		System.out.println(lista.contem("F"));
		System.out.println(lista.contem("C"));
		
		

	}

}
