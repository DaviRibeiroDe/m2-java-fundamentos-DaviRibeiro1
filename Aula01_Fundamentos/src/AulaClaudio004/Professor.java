package AulaClaudio004;

public class Professor {
	
	    String nome;
	    String especialidade;

	    public Professor(String nome, String especialidade) {
	        this.nome = nome;
	        this.especialidade = especialidade;
	    }

	    public void exibir() {
	        System.out.println("Professor: " + nome + " | Especialidade: " + especialidade);
	    }
	}


