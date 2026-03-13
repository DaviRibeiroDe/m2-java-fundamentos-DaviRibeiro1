package br.senai.ds2026.javafundamentos.aula05_matrizes;

import java.util.Scanner;

public class Atividade01 {
	 public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);

	        double[] vendas = new double[7];
	        double totalVendas = 0;

	        System.out.println("=== Registro de Vendas da Semana ===");

	        // Entrada de dados
	        for (int i = 0; i < vendas.length; i++) {
	            System.out.print("Digite o valor das vendas do dia " + (i + 1) + ": ");
	            vendas[i] = scanner.nextDouble();
	        }

	        // Processamento - soma das vendas
	        for (int i = 0; i < vendas.length; i++) {
	            totalVendas += vendas[i];
	        }

	        // Saída de dados
	        System.out.println("\n=== Resumo das Vendas ===");

	        for (int i = 0; i < vendas.length; i++) {
	            System.out.println("Dia " + (i + 1) + ": R$ " + vendas[i]);
	        }

	        System.out.println("\nTotal de vendas da semana: R$ " + totalVendas);

	        scanner.close();
	    }
	}


