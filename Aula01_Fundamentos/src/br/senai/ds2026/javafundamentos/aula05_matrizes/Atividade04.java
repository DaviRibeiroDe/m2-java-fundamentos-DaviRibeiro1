package br.senai.ds2026.javafundamentos.aula05_matrizes;

import java.util.Scanner;

public class Atividade04 {
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double[][] notas = new double[3][3];

        System.out.println("=== Registro de Notas dos Alunos ===");

        // Entrada das notas
        for (int aluno = 0; aluno < 3; aluno++) {
            System.out.println("\nAluno " + (aluno + 1));
            
            for (int disciplina = 0; disciplina < 3; disciplina++) {
                System.out.print("Digite a nota da disciplina " + (disciplina + 1) + ": ");
                notas[aluno][disciplina] = scanner.nextDouble();
            }
        }

        // Exibição das notas em tabela
        System.out.println("\n=== Boletim dos Alunos ===");

        System.out.println("        Disc1   Disc2   Disc3");

        for (int aluno = 0; aluno < 3; aluno++) {
            System.out.print("Aluno " + (aluno + 1) + "   ");
            
            for (int disciplina = 0; disciplina < 3; disciplina++) {
                System.out.print(notas[aluno][disciplina] + "   ");
            }
            
            System.out.println();
        }

        scanner.close();
    }
}


