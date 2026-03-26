package javafundamentosAulaClaudio006Extends;

import java.util.*;
public class TesteExtends {
    public static void main(String[] args) {

        List<Cachorro> listaCachorros = new ArrayList<>();
        listaCachorros.add(new Cachorro());

        List<? extends Animal> animais = listaCachorros; // ← faltava ;

        Animal a = animais.get(0);
        a.emitirSom();
    }
}