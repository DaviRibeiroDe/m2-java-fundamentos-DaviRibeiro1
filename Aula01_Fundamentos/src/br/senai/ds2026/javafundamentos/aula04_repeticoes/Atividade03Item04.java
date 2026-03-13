package br.senai.ds2026.javafundamentos.aula04_repeticoes;

import java.util.Scanner;

public class Atividade03Item04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        String nomeProduto;
        double precoProduto;
        int quantidadeEstoque;
        char continuar;

        int totalProdutos = 0;

        System.out.println("=== Sistema de Cadastro de Produtos ===");

        do {
            System.out.print("\nNome do produto: ");
            nomeProduto = scanner.nextLine();

            System.out.print("Preço do produto: ");
            precoProduto = scanner.nextDouble();

            System.out.print("Quantidade em estoque: ");
            quantidadeEstoque = scanner.nextInt();

            scanner.nextLine(); // limpar buffer

            totalProdutos++;

            System.out.print("Deseja cadastrar outro produto? (S/N): ");
            continuar = scanner.next().charAt(0);
            scanner.nextLine(); // limpar buffer

        } while (continuar == 'S' || continuar == 's');

        System.out.println("\n=== Resultado ===");
        System.out.println("Quantidade total de produtos cadastrados: " + totalProdutos);

        scanner.close();
    }

		// TODO Auto-generated method stub

	}


