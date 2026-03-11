package br.senai.ds2026.javafundamentos.aula01_console;
import java.util.Scanner;

public class Exemplo01CadastroFuncionario {

	public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("=== SISTEMA DE REGISTRO DE FUNCIONÁRIO ===");

        System.out.println("Digite as informações solicitadas abaixo. ");
        System.out.print("Nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Idade: ");
        int idade = scanner.nextInt();

        scanner.nextLine(); 

        System.out.print("Cargo: ");
        String cargo = scanner.nextLine();

        System.out.print("Salário mensal: ");
        double salarioMensal = scanner.nextDouble();

        System.out.print("Horas trabalhadas por dia: ");
        int horasDia = scanner.nextInt();

        double salarioAnual = salarioMensal * 12;
        double salarioDia = salarioMensal / 22;
        double valorHora = salarioDia / horasDia;

        System.out.println("\n=== RESUMO DO FUNCIONÁRIO ===");

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cargo: " + cargo);

        System.out.println("\n=== INFORMAÇÕES SALARIAIS ===");

        System.out.println("Salário mensal: R$ " + salarioMensal);
        System.out.println("Salário anual: R$ " + salarioAnual);
        System.out.println("Valor aproximado por dia: R$ " + salarioDia);
        System.out.println("Valor aproximado por hora: R$ " + valorHora);

        scanner.close();

	}

}
