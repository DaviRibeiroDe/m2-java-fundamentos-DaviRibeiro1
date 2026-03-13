package br.senai.ds2026.javafundamentos.aula04_repeticoes;

import java.util.Scanner;

public class Atividade01Item04 {

	public static void main1(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);

		        double valorVenda;
		        double totalArrecadado = 0;
		        int quantidadeVendas = 0;

		        System.out.println("=== Registro de Vendas Diárias ===");

		        System.out.print("Digite o valor da venda (0 para encerrar): ");
		        valorVenda = scanner.nextDouble();

		        while (valorVenda != 0) {

		            if (valorVenda > 0) {
		                totalArrecadado += valorVenda;
		                quantidadeVendas++;
		            } else {
		                System.out.println("Turno inválido.");
		            }

		            System.out.print("Digite o valor da venda (0 para encerrar): ");
		            valorVenda = scanner.nextDouble();
		        }

		        System.out.println("\n=== Resumo das Vendas ===");
		        System.out.println("Quantidade total de vendas: " + quantidadeVendas);
		        System.out.println("Valor total arrecadado: R$ " + totalArrecadado);

		        scanner.close();
		    }
		// TODO Auto-generated method stub
	}


