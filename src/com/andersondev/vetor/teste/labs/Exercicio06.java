package com.andersondev.vetor.teste.labs;

import java.util.Scanner;

import com.andersondev.vetor.VetorDinamico;
import com.andersondev.vetor.teste.Contatos;

public class Exercicio06 {

	public static void main(String[] args) {

		//Criação das variáveis

		Scanner scan  = new Scanner(System.in);


		//Criar um vetor com 20 de capacidade
		VetorDinamico<Contatos> lista = new VetorDinamico<>(20);


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
	

	protected static void adicionaContatoFinal(Scanner scan, VetorDinamico<Contatos> lista) {
		System.out.println("Gravando Contato, digite as informações: ");
		String nome = lerInformacao("Digite seu nome", scan);
		String telefone = lerInformacao("Digite seu telefone", scan);
		String email = lerInformacao("Digite seu email", scan);

		Contatos contato = new Contatos(nome, telefone, email);
		lista.adiciona(contato);
		System.out.println("Contato cadastrado com sucesso!");
		System.out.println(contato);
	}

	protected static void adicionaContatoPosicao(Scanner scan, VetorDinamico<Contatos> lista) {
		System.out.println("Gravando Contato, digite as informações: ");
		String nome = lerInformacao("Digite seu nome", scan);
		String telefone = lerInformacao("Digite seu telefone", scan);
		String email = lerInformacao("Digite seu email", scan);

		Contatos contato = new Contatos(nome, telefone, email);
		int pos = lerInformacaoInt("Entre com a posição a adicionar", scan);
		try {

			lista.adiciona(pos, contato);
			System.out.println("Contato cadastrado com sucesso!");
			System.out.println(contato);

		} catch (Exception e) {

			System.out.println("Posição Inválida! Contato não adicionado");
		}

	}

	protected static void obtemContatoPosicao(Scanner scan, VetorDinamico<Contatos> lista) {

		int pos = lerInformacaoInt("Entre com a posição da pesquisa: ", scan);
		try {

			Contatos contato = lista.busca(pos);
			System.out.println("Contato existente, seguem as informações: ");
			System.out.println(contato);

		} catch (Exception e) {

			System.out.println("Posição inválida!!");
		}
	}

	protected static void obtemContato(Scanner scan, VetorDinamico<Contatos> lista) {

		int pos = lerInformacaoInt("Entre com a posição da pesquisa: ", scan);
		try {

			Contatos contato = lista.busca(pos);
			System.out.println("Contato existente, seguem as informações: ");
			System.out.println(contato);

			System.out.println("Pesquisando contato encontrado");
			pos = lista.busca(contato);

			System.out.println("Contato encontrado na posição: " +pos);

		} catch (Exception e) {

			System.out.println("Posição inválida!!");
		}
	}

	protected static void pesquisaUltimoIndice(Scanner scan, VetorDinamico<Contatos> lista) {

		int pos = lerInformacaoInt("Entre com a posição da pesquisa: ", scan);
		try {

			Contatos contato = lista.busca(pos);
			System.out.println("Contato existente, seguem as informações: ");
			System.out.println(contato);

			System.out.println("Pesquisando último índice de contato encontrado");
			pos = lista.ultimoIndice(contato);

			System.out.println("Contato encontrado na posição: " +pos);

		} catch (Exception e) {

			System.out.println("Posição inválida!!");
		}
	}

	protected static void pesquisaContatoExiste(Scanner scan, VetorDinamico<Contatos> lista) {

		int pos = lerInformacaoInt("Entre com a posição da pesquisa: ", scan);
		try {

			Contatos contato = lista.busca(pos);
			boolean existe = lista.contem(contato);

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

	protected static void excluirPorPosicao(Scanner scan, VetorDinamico<Contatos> lista) {

		int pos = lerInformacaoInt("Entre com a posição da pesquisa: ", scan);
		try {

			lista.remove(pos);
			System.out.println("Contato excluído!!");
		} catch (Exception e) {

			System.out.println("Posição inválida!!");
		}
	}

	protected static void excluirContato(Scanner scan, VetorDinamico<Contatos> lista) {

		int pos = lerInformacaoInt("Entre com a posição da pesquisa: ", scan);
		try {
			Contatos contato = lista.busca(pos);
			lista.remove(contato);
			System.out.println("Contato excluído!!");
		} catch (Exception e) {

			System.out.println("Posição inválida!!");
		}
	}

	protected static void mostraTamanhoVetor(VetorDinamico<Contatos> lista) {

		System.out.println("O tamanho do vetor é: " + lista.tamaho());

	}
	
	protected static void limparVetor(VetorDinamico<Contatos> lista) {

		lista.limpar();
		System.out.println("Todos os contatos removidos!!");

	}
	
	protected static void imprimirVetor(VetorDinamico<Contatos> lista) {

		System.out.println(lista);

	}

	protected static String lerInformacao(String informacao, Scanner scan) {

		System.out.println(informacao);
		String entrada = scan.nextLine();
		return entrada;
	}

	protected static int lerInformacaoInt(String informacao, Scanner scan) {

		boolean entradaValida= false;
		int num = 0;
		while(!entradaValida) {

			try {
				System.out.println(informacao);
				String entrada = scan.nextLine();
				num = Integer.parseInt(entrada);
				entradaValida = true;
			}catch (Exception e) {
				System.out.println("Entrada inválida, digite de 1 a 11 e 0 para sair!\n\n");
			}

		}
		return num;


	}

	protected static int obterOpcaoMenu(Scanner scan) {

		boolean entradaValida= false;
		int opcao = 0;
		String entrada;

		while(!entradaValida) {

			System.out.println("Digite a opção desejada: ");
			System.out.println("1 : Adiciona Contato ao final do Vetor: ");
			System.out.println("2 : Adiciona Contato em uma posição específica: ");
			System.out.println("3 : Obtém Contato em uma posição específica: ");
			System.out.println("4 : Consulta Contato: ");
			System.out.println("5 : Consulta último índice do contato: ");
			System.out.println("6 : Verifica se contato existe: ");
			System.out.println("7 : Excluir por posição: ");
			System.out.println("8 : Excluir contato: ");
			System.out.println("9 : Excluir contato: ");
			System.out.println("10: Excluir todos os contato do vetor: ");
			System.out.println("11: Imprime vetor: ");
			System.out.println("0 : Sair: ");

			try {
				entrada = scan.nextLine();
				opcao = Integer.parseInt(entrada);

				if(opcao >=0 && opcao <=11) {
					entradaValida = true;
				}else {
					throw new Exception();
				}

			} catch (Exception e) {

				System.out.println("Entrada inválida, digite de 1 a 11 e 0 para sair!\n\n");
			}

		}

		return opcao;
	}

	protected static void criarContatoDinamicamente(int quantidade, VetorDinamico<Contatos> lista) {
		Contatos contato;
		for(int i=1; i<=quantidade; i++) {
			contato = new Contatos();
			contato.setNome("Contato " + i);
			contato.setTelefone("222222" +i);
			contato.setEmail("contato"+i+"@gmail.com");

		}
	}
}

	


