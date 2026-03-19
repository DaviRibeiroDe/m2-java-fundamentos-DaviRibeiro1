package br.senai.ds2026.javafundamentosAulaClaudio002;

// Interface
interface Pagamento {
    void realizarPagamento(double valor);
}

// Classe Cartão de Crédito
class CartaoCredito implements Pagamento {

    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado com Cartão de Crédito.");
    }
}

// Classe Boleto
class Boleto implements Pagamento {

    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado com Boleto.");
    }
}

// Classe Pix
class Pix implements Pagamento {

    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado via Pix.");
    }
}

// Classe principal
public class TesteInterface {

    public static void main(String[] args) {

        Pagamento p1 = new CartaoCredito();
        Pagamento p2 = new Boleto();
        Pagamento p3 = new Pix();

        p1.realizarPagamento(100.0);
        p2.realizarPagamento(200.0);
        p3.realizarPagamento(300.0);
    }
}