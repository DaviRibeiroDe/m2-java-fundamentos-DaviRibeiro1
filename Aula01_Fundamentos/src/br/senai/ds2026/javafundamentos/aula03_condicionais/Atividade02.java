package br.senai.ds2026.javafundamentos.aula03_condicionais;

import java.util.Scanner;

public class Atividade02 {
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o nome da pessoa: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        // Classificação da idade
        String classificacao;

        if (idade < 18) {
            classificacao = "Menor de idade";
        } else if (idade >= 18 && idade <= 59) {
            classificacao = "Adulto";
        } else {
            classificacao = "Idoso";
        }

        // Saída organizada
        System.out.println("\n--- Resumo do Cadastro ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Classificação: " + classificacao);

        scanner.close();
    }
}


