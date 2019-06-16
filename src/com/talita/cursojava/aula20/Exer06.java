package com.talita.cursojava.aula20;

import java.util.Scanner;

import javax.management.openmbean.TabularData;

public class Exer06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// criar matriz 3x3
		char tabuleiro[][] = new char[3][3];
		int pLinha;
		int pColuna;
		char jogada=' ';
		boolean ganhador = false;
		boolean velha;
		int jogador = 1;
		boolean jogou;
		boolean ocupado;
		String nome1;
		String nome2;
		String nomeExibido = null;
 System.out.println("Insira o nome do jogador 1");
 nome1=scan.next();
 System.out.println("Insira o nome do jogador 2");
 nome2=scan.next();
		iniciarTabuleiro(tabuleiro);
		// mostra o tabuleiro
		mostrarTabuleiro(tabuleiro);

		while (ganhador != true) {

			// pede para o jogardor informar a posição que ele quer jogar e mostra o jogador
			do {
			if(jogador ==1) {
				nomeExibido=nome1;
			}
			if (jogador==2) {
				nomeExibido=nome2;
			}
				System.out.println("Agora é a vez do  jogador " + jogador + "  "+nomeExibido+".");
				System.out.println("Informe a posição que deseja jogar.");
				System.out.println("Informe primeiro a Linha");
				pLinha = scan.nextInt();
				System.out.println("Informe agora a Coluna");
				pColuna = scan.nextInt();
			} while (verificarSePodeJogar(tabuleiro, pLinha, pColuna) == true);
			jogou = false;
			if(jogador==1) {
				jogada='x';
				jogou=true;
			}
			if (jogador==2) {
				jogada='o';
				jogou=true;
			}
			// pede ao jogador para inserir 0 ou x[

			// inseira o 0 ou x na posição escolhida

		/*
			do {
				System.out.println("Digite agora sua jogada 'x' ou 'o'");
				String temp = scan.next();
				jogada = temp.charAt(0);
				if (jogada == 'x' || jogada == 'o') {
					jogou = true;
				}
			} while (jogou == false);
*/
			// trocar jogador

			if (jogador == 1) {
				jogador = 2;
			} else {
				jogador = 1;
			}

			// inserir a jogada no tabuleiro
			tabuleiro[pLinha][pColuna] = jogada;
			// atualizar o tabuleiro
			mostrarTabuleiro(tabuleiro);

			// verificar se é velha ou se ha ganhador, se sim para o jogo

			// verificar ganhadores
			ganhador = verificaGanhador(tabuleiro);

			if (ganhador == true) {
				System.out.println("Jogo finalizado com ganhador " + jogador + ".");
			} else {
				if (verificaVelha(tabuleiro)) {
					System.out.println("Deu velha, jogue novamente!");
					ganhador = true;
				}
			}
		}
	}

	public static boolean verificarSePodeJogar(char[][] tabuleiro, int pLinha, int pColuna) {

		if (tabuleiro[pLinha][pColuna] == 'x' || tabuleiro[pLinha][pColuna] == 'o') {
			System.out.println("Essa posição já foi jogada por favor escolha outra posição");
			return true;
		}
		return false;
	}

	public static boolean verificaVelha(char[][] tabuleiro) {
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[i].length; j++) {
				if (tabuleiro[i][j] == '_') {
					return false;

				}
			}
		}
		return true;
	}

	public static void iniciarTabuleiro(char[][] tabuleiro) {
		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[i].length; j++) {
				tabuleiro[i][j] = '_';
			}
		}
	}

	public static boolean verificaGanhador(char[][] tabuleiro) {
		// regra1linha
		if (tabuleiro[0][0] != '_' && tabuleiro[0][0] == tabuleiro[0][1] && tabuleiro[0][0] == tabuleiro[0][2]) {
			return true;

		}
		// regra2linha
		if (tabuleiro[1][0] != '_' && tabuleiro[1][0] == tabuleiro[1][1] && tabuleiro[1][0] == tabuleiro[1][2]) {
			return true;

		}
		// regra3 linha
		if (tabuleiro[2][0] != '_' && tabuleiro[2][0] == tabuleiro[2][1] && tabuleiro[2][0] == tabuleiro[2][2]) {
			return true;

		}

		// regra 4 coluna
		if (tabuleiro[0][0] != '_' && tabuleiro[0][0] == tabuleiro[1][0] && tabuleiro[0][0] == tabuleiro[2][0]) {
			return true;

		}
		// regra5 coluna
		if (tabuleiro[0][1] != '_' && tabuleiro[0][1] == tabuleiro[1][1] && tabuleiro[0][1] == tabuleiro[1][2]) {
			return true;

		}
		// regra6 coluna
		if (tabuleiro[0][2] != '_' && tabuleiro[0][2] == tabuleiro[1][2] && tabuleiro[0][2] == tabuleiro[2][2]) {
			return true;

		}

		// regra7 diagonal
		if (tabuleiro[0][0] != '_' && tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[0][0] == tabuleiro[2][2]) {
			return true;

		}
		// regra diagonal
		if (tabuleiro[2][0] != '_' && tabuleiro[2][0] == tabuleiro[1][1] && tabuleiro[2][0] == tabuleiro[0][2]) {
			return true;

		}

		return false;

	}

	public static void mostrarTabuleiro(char[][] tabuleiro) {
		for (int i = 0; i < tabuleiro.length; i++) {

			System.out.print("|");

			for (int j = 0; j < tabuleiro[i].length; j++) {
				System.out.print(tabuleiro[i][j]);
			}

			System.out.println("|");
		}
	}
}
