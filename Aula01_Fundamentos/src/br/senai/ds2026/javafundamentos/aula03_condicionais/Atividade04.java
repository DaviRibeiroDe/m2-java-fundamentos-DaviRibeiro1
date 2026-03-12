package br.senai.ds2026.javafundamentos.aula03_condicionais;

import java.util.Scanner;

public class Atividade04 {
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o valor total da compra: ");
        double valorCompra = scanner.nextDouble();

        double valorDesconto = 0;
        double valorFinal = valorCompra;

        // Verificação de desconto
        if (valorCompra > 200) {
            valorDesconto = valorCompra * 0.10;
            valorFinal = valorCompra - valorDesconto;
        }

        // Saída organizada
        System.out.println("\n--- Resumo da Compra ---");
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Valor da compra: R$ " + valorCompra);
        System.out.println("Valor do desconto: R$ " + valorDesconto);
        System.out.println("Valor final da compra: R$ " + valorFinal);

        scanner.close();
    }
}


