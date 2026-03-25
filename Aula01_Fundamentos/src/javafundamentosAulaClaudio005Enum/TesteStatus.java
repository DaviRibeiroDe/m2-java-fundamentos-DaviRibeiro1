package javafundamentosAulaClaudio005Enum;

	enum StatusProjeto {
	    PLANEJADO, EM_ANDAMENTO, CONCLUIDO, CANCELADO
	}

	class Projeto {
	    private String nome;
	    private StatusProjeto status;

	    public Projeto(String nome, StatusProjeto status) {
	        this.nome = nome;
	        this.status = status;
	    }

	    public void mostrarStatus() {
	        System.out.println("Projeto: " + nome + " | Status: " + status);
	    }
	}

	public class TesteStatus {
	    public static void main(String[] args) {
	        Projeto p1 = new Projeto("Rede Corporativa", StatusProjeto.EM_ANDAMENTO);
	        Projeto p2 = new Projeto("Migração para Nuvem", StatusProjeto.PLANEJADO);

	        p1.mostrarStatus();
	        p2.mostrarStatus();
	    }
	}


