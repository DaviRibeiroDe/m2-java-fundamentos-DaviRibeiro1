package br.senai.ds2026.javafundamentos.aula03_condicionais;

import java.util.Scanner;

public class Atividade03 {
	 public static void main(String[] args) {

	        Scanner scanner = new Scanner(System.in);

	        // Entrada de dados
	        System.out.print("Digite o nome do cliente: ");
	        String nome = scanner.nextLine();

	        System.out.print("Digite o número do atendimento: ");
	        int numeroAtendimento = scanner.nextInt();

	        System.out.print("Digite o código do setor (1 a 4): ");
	        int codigoSetor = scanner.nextInt();

	        String setor;

	        // Estrutura switch/case
	        switch (codigoSetor) {
	            case 1:
	                setor = "Financeiro";
	                break;
	            case 2:
	                setor = "Suporte Técnico";
	                break;
	            case 3:
	                setor = "Recursos Humanos";
	                break;
	            case 4:
	                setor = "Comercial";
	                break;
	            default:
	                setor = "Setor inválido";
	        }

	        // Saída organizada
	        System.out.println("\n--- Resumo do Atendimento ---");
	        System.out.println("Nome do cliente: " + nome);
	        System.out.println("Número do atendimento: " + numeroAtendimento);
	        System.out.println("Código do setor informado: " + codigoSetor);
	        System.out.println("Nome do setor: " + setor);

	        scanner.close();
	    }
	}


