package com.andersondev.vetor.teste;

import com.andersondev.vetor.VetorDinamico;

public class AulaVetor10 {

	public static void main(String[] args) {
		
		VetorDinamico<Contatos> vetor = new VetorDinamico<Contatos>(2);
		
		Contatos c1 = new Contatos("Contato1", "1234-5678", "contato1@gmail.com");
		Contatos c2 = new Contatos("Contato2", "4321-5678", "contato2@gmail.com");
		Contatos c3 = new Contatos("Contato3", "3241-5678", "contato3@gmail.com");
		
		Contatos c4 = new Contatos("Contato4", "2431-5678", "contato4@gmail.com");
		
		vetor.adiciona(c1);
		vetor.adiciona(c2);
		vetor.adiciona(c3);
		vetor.adiciona(c4);
		
		System.out.println(vetor);
		
	}

}
