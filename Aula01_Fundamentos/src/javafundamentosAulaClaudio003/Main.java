package javafundamentosAulaClaudio003;

public class Main {

    public static void main(String[] args) {
        Dono dono1 = new Dono("Guizin");
        Carro carro1 = new Carro("Porsche 911", "Porsche", 2020, dono1);
        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("Marca do carro: " + carro1.getMarca());
        System.out.println("Ano do carro: " + carro1.getAno());
        System.out.println("Dono do carro: " + carro1.getDono().getNome());
        System.out.println("============================================\n");
        Dono dono2 = new Dono("Wedzinn");
        Carro carro2 = new Carro ("Gol", "Volkswagen", 1994, dono2);
        System.out.println("Modelo: " + carro2.getModelo());
        System.out.println("Marca do carro: " + carro2.getMarca());
        System.out.println("Ano do carro: " + carro2.getAno());
        System.out.println("Dono do carro: " + carro2.getDono().getNome());
        
    }
    
}