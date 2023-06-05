package com.andersondev.vetor.teste.labs;

import java.util.ArrayList;
import java.util.Scanner;


import com.andersondev.vetor.teste.Contatos;

public class Exercicio07 extends Exercicio06 {

	public static void main(String[] args) {

		//Criação das variáveis

		Scanner scan  = new Scanner(System.in);


		//Criar um vetor com 20 de capacidade
		ArrayList<Contatos> lista = new ArrayList<>(20);


		//Criar e Adicionar 30 contatos
		criarContatoDinamicamente(5, lista);


		// Criar um menu para o usuario interagir
		int opcao = 1;
		while(opcao != 0) {
			opcao = obterOpcaoMenu(scan);
			
			switch (opcao) {
			case 1: 

				adicionaContatoFinal(scan, lista);
				break;
			case 2:
				adicionaContatoPosicao(scan, lista);
				break;
			case 3:
				obtemContatoPosicao(scan, lista);
				break;
			case 4:
				obtemContato(scan, lista);
				break;	
			case 5:
				pesquisaUltimoIndice(scan, lista);
				break;
			case 6:
				pesquisaContatoExiste(scan, lista);
				break;
			case 7:
				excluirPorPosicao(scan, lista);
				break;
			case 8:
				excluirContato(scan, lista);
				break;
			case 9:
				mostraTamanhoVetor(lista);
				break;
			case 10:
				limparVetor(lista);
				break;
			case 11:
				imprimirVetor(lista);
				break;				
			default:
				break;
			}
		}
		System.out.println("Usuário Digitou 0, programa finalizado!");
	}
	

	protected static void adicionaContatoFinal(Scanner scan, ArrayList<Contatos> lista) {
		System.out.println("Gravando Contato, digite as informações: ");
		String nome = lerInformacao("Digite seu nome", scan);
		String telefone = lerInformacao("Digite seu telefone", scan);
		String email = lerInformacao("Digite seu email", scan);

		Contatos contato = new Contatos(nome, telefone, email);
		lista.add(contato);
		System.out.println("Contato cadastrado com sucesso!");
		System.out.println(contato);
	}

	protected static void adicionaContatoPosicao(Scanner scan, ArrayList<Contatos> lista) {
		System.out.println("Gravando Contato, digite as informações: ");
		String nome = lerInformacao("Digite seu nome", scan);
		String telefone = lerInformacao("Digite seu telefone", scan);
		String email = lerInformacao("Digite seu email", scan);

		Contatos contato = new Contatos(nome, telefone, email);
		int pos = lerInformacaoInt("Entre com a posição a adicionar", scan);
		try {

			lista.add(pos, contato);
			System.out.println("Contato cadastrado com sucesso!");
			System.out.println(contato);

		} catch (Exception e) {

			System.out.println("Posição Inválida! Contato não adicionado");
		}

	}

	protected static void obtemContatoPosicao(Scanner scan, ArrayList<Contatos> lista) {

		int pos = lerInformacaoInt("Entre com a posição da pesquisa: ", scan);
		try {

			Contatos contato = lista.get(pos);
			System.out.println("Contato existente, seguem as informações: ");
			System.out.println(contato);

		} catch (Exception e) {

			System.out.println("Posição inválida!!");
		}
	}

	protected static void obtemContato(Scanner scan, ArrayList<Contatos> lista) {

		int pos = lerInformacaoInt("Entre com a posição da pesquisa: ", scan);
		try {

			Contatos contato = lista.get(pos);
			System.out.println("Contato existente, seguem as informações: ");
			System.out.println(contato);

			System.out.println("Pesquisando contato encontrado");
			pos = lista.indexOf(contato);

			System.out.println("Contato encontrado na posição: " +pos);

		} catch (Exception e) {

			System.out.println("Posição inválida!!");
		}
	}

	protected static void pesquisaUltimoIndice(Scanner scan, ArrayList<Contatos> lista) {

		int pos = lerInformacaoInt("Entre com a posição da pesquisa: ", scan);
		try {

			Contatos contato = lista.get(pos);
			System.out.println("Contato existente, seguem as informações: ");
			System.out.println(contato);

			System.out.println("Pesquisando último índice de contato encontrado");
			pos = lista.lastIndexOf(contato);

			System.out.println("Contato encontrado na posição: " +pos);

		} catch (Exception e) {

			System.out.println("Posição inválida!!");
		}
	}

	protected static void pesquisaContatoExiste(Scanner scan, ArrayList<Contatos> lista) {

		int pos = lerInformacaoInt("Entre com a posição da pesquisa: ", scan);
		try {

			Contatos contato = lista.get(pos);
			boolean existe = lista.contains(contato);

			if(existe) {

				System.out.println("Contato existente, seguem as informações: ");
				System.out.println(contato);
			}else {

				System.out.println("Contato não existe ");
			}


		} catch (Exception e) {

			System.out.println("Posição inválida!!");
		}
	}

	protected static void excluirPorPosicao(Scanner scan, ArrayList<Contatos> lista) {

		int pos = lerInformacaoInt("Entre com a posição da pesquisa: ", scan);
		try {

			lista.remove(pos);
			System.out.println("Contato excluído!!");
		} catch (Exception e) {

			System.out.println("Posição inválida!!");
		}
	}

	protected static void excluirContato(Scanner scan, ArrayList<Contatos> lista) {

		int pos = lerInformacaoInt("Entre com a posição da pesquisa: ", scan);
		try {
			Contatos contato = lista.get(pos);
			lista.remove(contato);
			System.out.println("Contato excluído!!");
		} catch (Exception e) {

			System.out.println("Posição inválida!!");
		}
	}

	protected static void mostraTamanhoVetor(ArrayList<Contatos> lista) {

		System.out.println("O tamanho do vetor é: " + lista.size());

	}
	
	protected static void limparVetor(ArrayList<Contatos> lista) {

		lista.clear();
		System.out.println("Todos os contatos removidos!!");

	}
	
	protected static void imprimirVetor(ArrayList<Contatos> lista) {

		System.out.println(lista);

	}


	private static void criarContatoDinamicamente(int quantidade, ArrayList<Contatos> lista) {
		
		Contatos contato;
		
		for(int i=1; i<=quantidade; i++) {
			contato = new Contatos();
			contato.setNome("Contato " + i);
			contato.setTelefone("222222" +i);
			contato.setEmail("contato"+i+"@gmail.com");
			
			lista.add(contato);

		}
	}

}
