package javafundamentosAulaClaudio005Static;

public class TesteStatic {
    public static void main(String[] args) {
        Utilidades.mostrarMensagem();
        Utilidades.contador++;
        System.out.println("Contador: " + Utilidades.contador);
    }
}