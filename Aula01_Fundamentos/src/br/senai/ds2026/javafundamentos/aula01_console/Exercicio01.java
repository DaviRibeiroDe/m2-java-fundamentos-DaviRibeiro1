package br.senai.ds2026.javafundamentos.aula01_console;

import java.util.Scanner;

public class Exercicio01 {

	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Cadastro do aluno
	        System.out.println("=== REGISTRO DE ALUNO ===");

	        System.out.print("Nome do aluno: ");
	        String nome = scanner.nextLine();

	        System.out.print("Curso: ");
	        String curso = scanner.nextLine();

	        System.out.print("Nota 1: ");
	        double nota1 = scanner.nextDouble();

	        System.out.print("Nota 2: ");
	        double nota2 = scanner.nextDouble();

	        System.out.print("Nota 3: ");
	        double nota3 = scanner.nextDouble();

	        // Cálculo da média
	        double media = (nota1 + nota2 + nota3) / 3;

	        // Exibição do resultado
	        System.out.println("\n=== RESULTADO DO ALUNO ===");
	        System.out.println("Aluno: " + nome);
	        System.out.println("Curso: " + curso);

	        System.out.println("\nNotas:");
	        System.out.println("Nota 1: " + nota1);
	        System.out.println("Nota 2: " + nota2);
	        System.out.println("Nota 3: " + nota3);

	        System.out.println("\nMédia final: " + media);

	        scanner.close();
	    }
	}