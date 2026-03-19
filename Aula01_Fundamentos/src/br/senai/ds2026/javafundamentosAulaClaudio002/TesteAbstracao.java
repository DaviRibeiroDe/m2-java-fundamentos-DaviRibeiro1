package br.senai.ds2026.javafundamentosAulaClaudio002;

//Classe abstrata
abstract class Animal {
 
 // Método abstrato (sem implementação)
 public abstract void emitirSom();

 // Método comum (com implementação)
 public void dormir() {
     System.out.println("O animal está dormindo...");
 }
}

//Classe concreta que herda de Animal
class Cachorro extends Animal {

 @Override
 public void emitirSom() {
     System.out.println("O cachorro late: Au Au!");
 }
}

//Outra classe concreta
class Gato extends Animal {

 @Override
 public void emitirSom() {
     System.out.println("O gato mia: Miau!");
 }
}

//Programa principal
public class TesteAbstracao {

 public static void main(String[] args) {

     Animal a1 = new Cachorro();
     Animal a2 = new Gato();

     a1.emitirSom(); // Au Au!
     a2.emitirSom(); // Miau!
     a1.dormir();    // O animal está dormindo...
 }
}