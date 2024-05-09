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
}
