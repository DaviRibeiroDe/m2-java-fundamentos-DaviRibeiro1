package javafundamentosAulaClaudio006Generics;

	public class TesteCaixa {
	    public static void main(String[] args) {

	        Caixa<Integer> caixaInt = new Caixa<>();
	        caixaInt.setValor(10);
	        System.out.println("Valor inteiro: " + caixaInt.getValor());

	        Caixa<String> caixaStr = new Caixa<>();
	        caixaStr.setValor("Olá");
	        System.out.println("Valor string: " + caixaStr.getValor());
	    }
	}

