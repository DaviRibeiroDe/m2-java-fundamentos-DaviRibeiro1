package br.senai.ds2026.javafundamentos.aula05_matrizes;

import java.util.Scanner;

public class Atividade03 {
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] estoque = new int[5];
        int totalProdutos = 0;

        System.out.println("=== Cadastro de Produtos em Estoque ===");

        // Entrada de dados
        for (int i = 0; i < estoque.length; i++) {
            System.out.print("Digite a quantidade do produto " + (i + 1) + " em estoque: ");
            estoque[i] = scanner.nextInt();
        }

        // Soma das quantidades
        for (int i = 0; i < estoque.length; i++) {
            totalProdutos += estoque[i];
        }

        // Exibição dos dados
        System.out.println("\n=== Resumo do Estoque ===");

        for (int i = 0; i < estoque.length; i++) {
            System.out.println("Produto " + (i + 1) + ": " + estoque[i] + " unidades");
        }

        System.out.println("\nQuantidade total de produtos em estoque: " + totalProdutos);

        scanner.close();
    }
}


