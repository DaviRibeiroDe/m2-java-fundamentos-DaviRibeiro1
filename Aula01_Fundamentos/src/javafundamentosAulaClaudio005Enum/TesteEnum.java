package javafundamentosAulaClaudio005Enum;

	enum TesteEnum {
	    SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO
	}

	public class TesteEnum {
	    public static void main(String[] args) {
	        TesteEnum hoje = TesteEnum.QUARTA;

	        if (hoje == TesteEnum.QUARTA) {
	            System.out.println("Hoje é quarta-feira!");
	        }
	    }
	}


