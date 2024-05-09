package br.tec.abrindoportas.controller;

import java.util.Scanner;

public class VideoLocadora {
	public void locar() {
		//Bloco - Declaraçoa de Varáveis
		String nomeFilme, nomeUsuario, cpfUsuario, enderecoUsuario;
		final int TEMPOLOCACAO = 2;
		final double ACRESCIMO = 5.0;
		int duracaoLocacao, count;
		double duracaoFilme, valorFilme;

		Scanner read = new Scanner(System.in);

		for(count = 0; count < 5; count++) {
			//Bloco - Entrada de dados

			System.out.println("Digite o seu nome: ");
			nomeUsuario = read.next();
			System.out.println("Digite o seu CPF: ");
			cpfUsuario = read.next();
			System.out.println("Digite o seu Endereço: ");
			enderecoUsuario = read.next();

			System.out.println("Filme a ser locado: ");
			System.out.println("Nome do Filme: ");
			nomeFilme = read.next();
			System.out.println("Valor do Filme: ");
			valorFilme = read.nextDouble();
			System.out.println("Tempo do Filme: ");
			duracaoFilme = read.nextDouble();

			System.out.println("Prazo da entrega: ");
			duracaoLocacao = read.nextInt();

			//Bloco - Processamento e saída de dados
			if(duracaoLocacao <= TEMPOLOCACAO) {
				System.out.println("Muito obrigado, volte sempre.");
			}else {          //V                 AND           V
				if((duracaoLocacao > TEMPOLOCACAO)&&(duracaoLocacao == 3)) {
					valorFilme = valorFilme + ACRESCIMO;
					System.out.println("A data da entrega do filme excedeu a 2 dias"); 
							System.out.println(" por isso será cobrado " + ACRESCIMO + " reais. "); 
							System.out.println( " Total será R$" + valorFilme);
				}
			}
		}

	}
}
