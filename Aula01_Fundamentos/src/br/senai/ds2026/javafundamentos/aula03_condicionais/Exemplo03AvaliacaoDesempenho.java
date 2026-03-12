package br.senai.ds2026.javafundamentos.aula03_condicionais;
import java.util.Scanner;

public class Exemplo03AvaliacaoDesempenho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SISTEMA DE AVALIAÇÃO DE FUNCIONÁRIO ===");

        System.out.print("Nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Cargo: ");
        String cargo = scanner.nextLine();

        System.out.print("Pontuação de desempenho (0 a 100): ");
        int pontuacao = scanner.nextInt();

        System.out.print("Código do turno (1-Manhã | 2-Tarde | 3-Noite): ");
        int turno = scanner.nextInt();

        String resultado;

        if (pontuacao >= 70) {
            resultado = "Aprovado na avaliação";
        } else {
            resultado = "Necessita de melhoria";
        }

        String nomeTurno;

        switch (turno) {
            case 1:
                nomeTurno = "Manhã";
                break;

            case 2:
                nomeTurno = "Tarde";
                break;

            case 3:
                nomeTurno = "Noite";
                break;

            default:
                nomeTurno = "Turno inválido";
        }

        System.out.println("\n=== RESULTADO DA AVALIAÇÃO ===");

        System.out.println("Funcionário: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Pontuação: " + pontuacao);
        System.out.println("Resultado da avaliação: " + resultado);
        System.out.println("Turno de trabalho: " + nomeTurno);

        scanner.close();

	}

}
