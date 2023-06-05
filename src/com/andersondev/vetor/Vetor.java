package com.andersondev.vetor;

import java.util.Arrays;

public class Vetor {

	private String[] elementos;
	private int tamanho;

	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}

	/*
	 * public void adiciona(String elemento) {
	 * 
	 * for(int i=0; i < this.elementos.length; i++) {
	 * 
	 * if(this.elementos[i]== null) {
	 * 
	 * this.elementos[i] = elemento; break;
	 * 
	 * }
	 * 
	 * } }
	 */

	/*
	 * public void adiciona(String elemento) throws Exception { //Adiciona elemento
	 * ao final do vetor
	 * 
	 * if(this.tamanho < this.elementos.length) {
	 * 
	 * this.elementos[this.tamanho] = elemento; this.tamanho++;
	 * 
	 * }else { throw new Exception("Vetor Cheio, não cabem mais elementos!"); }
	 * 
	 * }
	 */

	public boolean adiciona(String elemento) {
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
	public boolean adiciona(int posicao, String elemento) {
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
			String[] elementosNovos = new String[this.elementos.length * 2];
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

	//Método para verificar se a posição é válida ou não
	public void validaPosicao(int posicao) {
		if (!(posicao >= 0 && posicao < tamanho)) {

			throw new IllegalArgumentException("Posição Inválida!");
		}
	}
	
	public String busca(int posicao) {
		// Obter elementos de uma posição

		if (!(posicao >= 0 && posicao < tamanho)) {

			throw new IllegalArgumentException("Posição Inválida!");
		}
		return this.elementos[posicao];

	}

	public int busca(String elemento) {
		// VERIFICA SE ELEMENTO NO VETOR EXISTE
		for (int i = 0; i < tamanho; i++) {
			if (elementos[i].equals(elemento)) {
				return i;
			}

		}
		return -1;
	}

}
