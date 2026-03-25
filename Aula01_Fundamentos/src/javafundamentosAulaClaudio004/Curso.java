package javafundamentosAulaClaudio004;

import java.util.ArrayList;

public class Curso {
	    String nome;
	    int cargaHoraria;
	    Professor professor;
	    ArrayList<Aluno> alunos;

	    public Curso(String nome, int cargaHoraria, Professor professor) {
	        this.nome = nome;
	        this.cargaHoraria = cargaHoraria;
	        this.professor = professor;
	        this.alunos = new ArrayList<>();
	    }

	    public void adicionarAluno(Aluno aluno) {
	        alunos.add(aluno);
	    }

	    public void exibirDados() {
	        System.out.println("\nCurso: " + nome);
	        System.out.println("Carga Horária: " + cargaHoraria + " horas");
	        professor.exibir();

	        System.out.println("Alunos matriculados:");
	        for (Aluno a : alunos) {
	            a.exibir();
	        }
	    }
	}



