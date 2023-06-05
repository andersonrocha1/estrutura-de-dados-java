package com.andersondev.vetor.teste;


import com.andersondev.vetor.VetorObjetos;

public class AulaVetor09 {
	
	public static void main(String[] args) {
		//Generalizando os tipos de elementos
		VetorObjetos vetor = new VetorObjetos(3);//Determinei o tamanho do vetor
		//Adicionei os elementos
	Contatos c1 = new Contatos("Contato1", "1234-5678", "contato1@gmail.com");
	Contatos c2 = new Contatos("Contato2", "4321-5678", "contato2@gmail.com");
	Contatos c3 = new Contatos("Contato3", "3241-5678", "contato3@gmail.com");
	
	Contatos c4 = new Contatos("Contato4", "2431-5678", "contato4@gmail.com");
		
		
		vetor.adiciona(c1);
		vetor.adiciona(c2);
		vetor.adiciona(c3);
		
		System.out.println("Tamanho = " +vetor.tamaho());
		int pos = vetor.busca(c4);
		if(pos > -1) {
			System.out.println("Elemento encontrado com sucesso!");
		}else {
			System.out.println("Elemento não encontrado!");
		}
	
		System.out.println(vetor);

	
		
		
		
		

	}
}
