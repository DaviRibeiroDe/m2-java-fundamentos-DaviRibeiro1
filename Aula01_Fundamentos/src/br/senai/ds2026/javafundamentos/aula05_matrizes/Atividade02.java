package br.senai.ds2026.javafundamentos.aula05_matrizes;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);

		        double[] notas = new double[5];
		        double somaDasNotas = 0;
		        double media;

		        System.out.println("=== Registro de Notas da Turma ===");

		        // Entrada das notas
		        for (int i = 0; i < notas.length; i++) {
		            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
		            notas[i] = scanner.nextDouble();
		        }

		        // Soma das notas
		        for (int i = 0; i < notas.length; i++) {
		            somaDasNotas += notas[i];
		        }

		        // Cálculo da média
		        media = somaDasNotas / notas.length;

		        // Exibição das notas
		        System.out.println("\n=== Notas Informadas ===");
		        for (int i = 0; i < notas.length; i++) {
		            System.out.println("Aluno " + (i + 1) + ": " + notas[i]);
		        }

		        // Exibição da média
		        System.out.println("\nMédia da turma: " + media);

		        scanner.close();
		    }
		
		// TODO Auto-generated method stub
	}

