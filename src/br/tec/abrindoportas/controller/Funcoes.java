package br.tec.abrindoportas.controller;

import java.util.Scanner;

public class Funcoes {

	public void mediaAritmetica() {
		//BLOCO - Declaração de variável
		int nota1, nota2, nota3, nota4, notar;
		float media, mediar;
		Scanner read = new Scanner(System.in);

		//BLOCO - Entrada de dados
		System.out.println("Digite a nota 1: ");
		nota1 = read.nextInt();
		System.out.println("Digite a nota 2: ");
		nota2 = read.nextInt();
		System.out.println("Digite a nota 3: ");
		nota3 = read.nextInt();
		System.out.println("Digite a nota 4: ");
		nota4 = read.nextInt();

		//BLOCO - Processamento
		media = (nota1+nota2+nota3+nota4)/4;

		//BLOCO - Saida de dados
		if (media >= 7) {//verdadeiro
			System.out.println("Aluno aprovado, com média: " + media);

		}else {
			System.out.println("Digite a nota da recuperação: ");
			notar = read.nextInt();
			mediar = (media+notar)/2;

			if (mediar >= 5) {
				System.out.println("Aluno aprovado com média em recuperação: " + mediar);
			}else {
				System.out.println("Aluno reprovado, com média: " + mediar);
			}
		}
	}

	/*
	 * Criar um programa que recebe um numero e verifica se
	 * ele está entre 0 e 10 e se 
	 * é par
	 */
	public void verificaPar() {
		//variável
		int numero;
		Scanner read = new Scanner(System.in);

		//entrada dados
		System.out.println("Digite o número: ");
		numero = read.nextInt();

		//processamento e saída dados
		if((numero >= 0) && (numero <= 10)) {
			if(numero % 2 == 0) {
				System.out.println("O numero " 
						+ numero 
						+ " está entre a faixa de 0 a 10 e é par");
			}else {
				System.out.println("O numero " 
						+ numero 
						+ " está na faixa de 0 a 10 e não é par");
			}
		}else {
			System.out.println("O numero " 
					+ numero 
					+ " não está entre a faixa de 0 a 10.");
		}

	}

	//Função irá ler um inteiro e mostrar o dia da semana
	public void escolha() {
		int dayWeekend = 6;
		Scanner read = new Scanner(System.in);
		
//		System.out.println("Digite o dia da semana:");
//		System.out.println("1 = Domingo,\n 2 = Segunda,\n 0 = Sair");
//		dayWeekend = read.nextInt();
		
		while(dayWeekend != 0) {
			System.out.println("Dentro do enquanto");
			System.out.println("Digite o dia da semana:");
			System.out.println("1 = Domingo,\n2 = Segunda,\n0 = Sair");
			dayWeekend = read.nextInt();
			
			//Esta estrutura serve para escolher uma opção. Retorna dia da semana.
			switch (dayWeekend) {
				case 1: {
					System.out.println("Domingo");
					break;
				}
				case 2: {
					System.out.println("Segunda-feira");
					break;
				}
				case 3: {
					System.out.println("Terça-feira");
					break;
				}
				case 4: {
					System.out.println("Quarta-feira");
					break;
				}
				case 5: {
					System.out.println("Quinta-feira");
					break;
				}
				case 6: {
					System.out.println("Sexta-feira");
					break;
				}
				case 7: {
					System.out.println("Sábado");
					break;
				}
				default: {
					System.out.println("\nOpção escolhida é existente.");
				}
			
			}
		}
	} //Função escolha
}
