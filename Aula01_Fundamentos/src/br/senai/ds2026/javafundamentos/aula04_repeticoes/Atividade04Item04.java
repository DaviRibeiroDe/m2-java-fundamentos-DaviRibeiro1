package br.senai.ds2026.javafundamentos.aula04_repeticoes;

import java.util.Scanner;

public class Atividade04Item04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        double valorCarro;

        System.out.println("=== Simulação de Pagamento de Veículo ===");

        System.out.print("Digite o valor do veículo: R$ ");
        valorCarro = scanner.nextDouble();

        // Cálculo do preço à vista com 20% de desconto
        double precoAvista = valorCarro - (valorCarro * 0.20);

        System.out.println("\nPreço à vista com desconto: R$ " + precoAvista);

        System.out.println("\nParcelas\tPreço Final\tValor da Parcela");

        int percentual = 3;

        for (int parcelas = 6; parcelas <= 60; parcelas += 6) {

            double acrescimo = percentual / 100.0;

            double precoFinal = valorCarro + (valorCarro * acrescimo);

            double valorParcela = precoFinal / parcelas;

            System.out.println(parcelas + "\t\t" +
                    String.format("%.2f", precoFinal) + "\t\t" +
                    String.format("%.2f", valorParcela));

            percentual += 3;
        }

        scanner.close();
    }

		// TODO Auto-generated method stub

	}


