package br.senai.ds2026.javafundamentos.aula04_repeticoes;

import java.util.Scanner;

public class Atividade02Item04 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        int quantidadeAlunos;
	        double nota;
	        double somaNotas = 0;
	        double media;

	        System.out.println("=== Cálculo de Média da Turma ===");

	        System.out.print("Digite a quantidade de alunos: ");
	        quantidadeAlunos = scanner.nextInt();

	        for (int i = 1; i <= quantidadeAlunos; i++) {
	            System.out.print("Digite a nota do aluno " + i + ": ");
	            nota = scanner.nextDouble();

	            somaNotas += nota;
	        }

	        media = somaNotas / quantidadeAlunos;

	        System.out.println("\n=== Resultado ===");
	        System.out.println("Quantidade de alunos: " + quantidadeAlunos);
	        System.out.println("Soma total das notas: " + somaNotas);
	        System.out.println("Média da turma: " + media);

	        scanner.close();
	    }
	
	// TODO Auto-generated method stub
	}


