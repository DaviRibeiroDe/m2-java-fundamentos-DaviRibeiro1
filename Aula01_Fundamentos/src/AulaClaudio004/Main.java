package AulaClaudio004;

public class Main {
	    public static void main(String[] args) {

	        // Criando professor
	        Professor prof = new Professor("Carlos", "Programação");

	        // Criando curso
	        Curso curso = new Curso("Java Básico", 40, prof);

	        // Criando alunos
	        Aluno a1 = new Aluno("Ana", "001");
	        Aluno a2 = new Aluno("João", "002");

	        // Adicionando alunos ao curso
	        curso.adicionarAluno(a1);
	        curso.adicionarAluno(a2);

	        // Exibindo dados do curso
	        curso.exibirDados();
	    }
	}


