package br.senai.ds2026.javafundamentosAulaClaudio;

public class Carro {

    private String cor;
    private String modelo;

    public Carro(String cor, String modelo) {
        this.cor = cor;
        this.modelo = modelo;
    }

    public void acelerar() {
        System.out.println("O carro está acelerando!");
    }

    public void frear() {
        System.out.println("O carro está freando!");
    }

    public void mostrarInfo() {
        System.out.println("Carro: " + modelo + " | Cor: " + cor);
    }

    public static void main(String[] args) {

        Carro meuCarro = new Carro("Prata", "Sedan");
        Carro outroCarro = new Carro("Branco", "SUV");

        meuCarro.mostrarInfo();
        meuCarro.acelerar();

        outroCarro.mostrarInfo();
        outroCarro.frear();
    }
}