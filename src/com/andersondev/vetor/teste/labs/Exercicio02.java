package com.andersondev.vetor.teste.labs;

import java.util.ArrayList;

import com.andersondev.vetor.VetorDinamico;

public class Exercicio02 {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>(5);
		
		arrayList.add("A");
		arrayList.add("B");
		arrayList.add("A");
		
		//Último indice da classe do java ArrayList
		System.out.println(arrayList.lastIndexOf("A"));
		
		VetorDinamico<String> lista = new VetorDinamico<>(5);
		
		lista.adiciona("A");
		lista.adiciona("B");
		lista.adiciona("A");
		
		//Último indice da classe que criei VetorDinamico
		System.out.println(lista.ultimoIndice("A"));
		
		

	}

}
