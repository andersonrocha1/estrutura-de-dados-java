package com.andersondev.vetor.teste.labs;

import java.util.ArrayList;

import com.andersondev.vetor.VetorDinamico;

public class Exercicio04 {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<>(5);
		
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("D");
		arrayList.add("E");
		arrayList.add("F");
		
		System.out.println(arrayList);
		
		arrayList.clear(); // Classe do ArrayList do java
		
		System.out.println(arrayList);
	
		VetorDinamico<String> lista = new VetorDinamico<>(5);
		
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("C");
		lista.adiciona("D");
		lista.adiciona("E");
		lista.adiciona("F");
		
		System.out.println(lista);
		
		lista.limpar(); // Nossa classe 
		
		System.out.println(lista);

		/*
		SAÍDA
		
		[A, B, C, D, E, F]
		[]
		[A, B, C, D, E, F]
		[]
				
		*/

	}

}
