package javafundamentosAulaClaudio006Generics;

	class Caixa<T> {
	    private T valor;

	    public void setValor(T valor) {
	        this.valor = valor;
	    }

	    public T getValor() {
	        return this.valor; // corrigido aqui
	    }
	}

