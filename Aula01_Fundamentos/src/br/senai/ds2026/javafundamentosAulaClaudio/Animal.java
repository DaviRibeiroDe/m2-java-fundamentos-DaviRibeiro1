package br.senai.ds2026.javafundamentosAulaClaudio;

public class Animal {

    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void comer() {
        System.out.println(nome + " está comendo.");
    }

    public void dormir() {
        System.out.println(nome + " está dormindo.");
    }

    public void mostrarInfo() {
        System.out.println("Nome: " + nome + " | Idade: " + idade);
    }

    public static void main(String[] args) {

        Animal cachorro = new Animal("Bob", 5);
        Animal gato = new Animal("Mika", 3);

        cachorro.mostrarInfo();
        cachorro.comer();
        cachorro.dormir();

        gato.mostrarInfo();
        gato.comer();
        gato.dormir();
    }
}