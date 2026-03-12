package br.senai.ds2026.javafundamentos.aula01_console;

import java.util.Scanner;

public class Exemplo01 {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Solicitar dados do produto
	        System.out.println("=== CADASTRO DE PRODUTO ===");
	        System.out.print("Nome do produto: ");
	        String nomeProduto = scanner.nextLine();
	        System.out.print("Código do produto: ");
	        int codigoProduto = scanner.nextInt();
	        System.out.print("Preço unitário: ");
	        double precoUnitario = scanner.nextDouble();
	        System.out.print("Quantidade em estoque: ");
	        int quantidade = scanner.nextInt();

	        // Calcular o valor total do estoque
	        double valorTotal = precoUnitario * quantidade;

	        // Exibir resumo do produto
	        System.out.println("\n=== RESUMO DO PRODUTO ===");
	        System.out.println("Produto: " + nomeProduto);
	        System.out.println("Código: " + codigoProduto);
	        System.out.println("Preço unitário: R$ " + precoUnitario);
	        System.out.println("Quantidade em estoque: " + quantidade);
	        System.out.println("Valor total em estoque: R$ " + valorTotal);

	        scanner.close();
	    }
	}