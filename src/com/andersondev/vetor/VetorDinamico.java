package com.andersondev.vetor;

import java.lang.reflect.Array;
import java.util.Arrays;

public class VetorDinamico<T> {

	private T[] elementos;
	private int tamanho;

	public VetorDinamico(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}

	public VetorDinamico(int capacidade, Class<T> tipoClasse) {
		this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
		this.tamanho = 0;
	}


	public boolean adiciona(T elemento) {
		//Aumentando a capacidade do vetor
		this.aumentaCapacidade();
		// Adiciona elemento ao final do vetor
		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;

	}
	//Adiciona um elemento ao vetor que já possui elementos, movendo e mantendo
	public boolean adiciona(int posicao, T elemento) {
		//Primeiro verificar se a posição é válida
		validaPosicao(posicao);
		this.aumentaCapacidade();
		
		//Mover todos os elementos antes de adicionar o elemento desejado
		for(int i = this.tamanho-1; i>=posicao; i--) {
			this.elementos[i+1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;
		
		return true;
	}

	public int tamaho() {

		return this.tamanho;
	}

	@Override
	public String toString() {
		// imprime elementos do vetor
		StringBuilder s = new StringBuilder();
		s.append("[");

		for (int i = 0; i < this.tamanho - 1; i++) {

			s.append(this.elementos[i]);
			s.append(", ");

		}
		if (this.tamanho > 0) {
			s.append(this.elementos[this.tamanho - 1]);
		}

		s.append("]");

		return s.toString();
	}
	
	//Aumentando capacidade do vetor
	private void aumentaCapacidade() {
		if(this.tamanho == this.elementos.length) {
			T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
			for(int i=0; i<this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			}
			this.elementos = elementosNovos;
		}
	}
	
	public void remove(int posicao) {
		validaPosicao(posicao);
		for(int i=posicao; i<this.tamanho-1; i++) {
			this.elementos[i] = this.elementos[i+1];
		}
		this.tamanho--;
	}

	//Melhorando o método remove
	public void remove(T elemento) {
		
		int pos = this.busca(elemento);
		
		if(pos > -1) {
			this.remove(pos);
		}
	}
	//Método para verificar se a posição é válida ou não
	public void validaPosicao(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {

			throw new IllegalArgumentException("Posição Inválida!");
		}
	}
	
	public T busca(int posicao) {
		
		//Verifica se posição é válida
		validaPosicao(posicao);
		// Obter elementos de uma posição
		return this.elementos[posicao];

	}

	public int busca(T elemento) {
		// VERIFICA SE ELEMENTO NO VETOR EXISTE
		for (int i = 0; i < tamanho; i++) {
			if (elementos[i].equals(elemento)) {
				return i;
			}

		}
		return -1;
	}
	
	//Criando um método de busca melhorado e usando o método busca existente
	//E resolvendo o exercício04
	public T obtem(int posicao) {
		
		return this.busca(posicao);
	}
	
	//Melhorando o método busca
	public boolean contem(T elemento) {
		/*
		int pos = busca(elemento);
		if(pos > -1) {
			return true;
		}
		return false;
		*/
		
		return busca(elemento) > -1;
	}
	
	//Resolvendo Exercicio ultimoIndice e melhorando classe
	public int ultimoIndice(T elemento) {
		
		for(int i = this.tamanho-1; i >=0; i--) {
			if(this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		
		return -1;
	}
	
	//Criando um método parecido com o existente no ArrayList na nossa classe
	public void limpar() {
		//Opção 1
		//this.elementos = (T[]) new Object[this.elementos.length];
		
		//Opção 2
		//this.tamanho = 0;
		
		//Opção 3 escolhida, é custosa, mas favorece a coleta do lixo
		for(int i=0; i<this.tamanho; i++) {
			this.elementos[i] = null;
		}
		this.tamanho = 0;
		
	}

}
