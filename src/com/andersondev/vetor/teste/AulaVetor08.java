package com.andersondev.vetor.teste;

import com.andersondev.vetor.Vetor;

public class AulaVetor08 {
	
	public static void main(String[] args) {
		//Aplicando o método de remover elemento em uma posição no vetor
		Vetor vetor = new Vetor(3);//Determinei o tamanho do vetor
		//Adicionei os elementos
		vetor.adiciona("B");
		vetor.adiciona("C");
		vetor.adiciona("E");
		vetor.adiciona("F");
		vetor.adiciona("G");
		vetor.adiciona("H");
		vetor.adiciona("I");

		System.out.println(vetor); //imprimir a lista original
		
		vetor.remove(5);//Removi o elemento na posição 5 com método de remover
		
		System.out.println(vetor);// Imprimir o vetor com a remoção
		
		vetor.adiciona(5, "H");// Adicionei novamente o mesmo elemento removido na mesma posição

		System.out.println(vetor);// imprimi o vetor com elemento readicionado.
		/*
		[B, C, E, F, G, H, I]
		[B, C, E, F, G, I]
		[B, C, E, F, G, H, I]
		
		*/
		//Caso queira remover um elemento quando não se sabe a posição
		
		int pos = vetor.busca("H");
		if(pos > -1) {
			vetor.remove(pos);
		}else {
			System.out.println("Elemento não existe no vetor");
		}
		System.out.println(vetor);
		/*
		      SAÍDA
		      [B, C, E, F, G, H, I]
			  [B, C, E, F, G, I]
			  [B, C, E, F, G, H, I]
		      [B, C, E, F, G, I]
		*/
		
		
		
		

	}
}
