package javafundamentosAulaClaudio005;

import java.util.*;

// Classe Aluno
class Aluno {
    String nome;
    String matricula;
    String curso;

    public Aluno(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }
}

// Classe Professor
class Professor {
    String nome;
    String disciplina;

    public Professor(String nome, String disciplina) {
        this.nome = nome;
        this.disciplina = disciplina;
    }
}

// Classe Avaliacao
class Avaliacao {
    String titulo;
    String data;
    Map<Aluno, Double> notas;

    public Avaliacao(String titulo, String data) {
        this.titulo = titulo;
        this.data = data;
        this.notas = new HashMap<>();
    }

    public void adicionarNota(Aluno aluno, double nota) {
        notas.put(aluno, nota);
    }

    public void exibirNotas() {
        System.out.println("Avaliação: " + titulo + " (" + data + ")");
        for (Aluno a : notas.keySet()) {
            System.out.println("Aluno: " + a.getNome() + " - Nota: " + notas.get(a));
        }
    }
}

// Classe Turma
class Turma {
    String codigo;
    Professor professor;
    List<Aluno> alunos;
    List<Avaliacao> avaliacoes;

    public Turma(String codigo, Professor professor) {
        this.codigo = codigo;
        this.professor = professor;
        this.alunos = new ArrayList<>();
        this.avaliacoes = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void adicionarAvaliacao(Avaliacao avaliacao) {
        avaliacoes.add(avaliacao);
    }

    public void exibirDados() {
        System.out.println("Turma: " + codigo);
        System.out.println("Professor: " + professor.nome + " - " + professor.disciplina);

        System.out.println("\nAlunos:");
        for (Aluno a : alunos) {
            System.out.println("- " + a.nome);
        }

        System.out.println("\nAvaliações:");
        for (Avaliacao av : avaliacoes) {
            av.exibirNotas();
        }
    }
}

// Classe principal
public class Main {
    public static void main(String[] args) {

        Professor prof = new Professor("Carlos", "Matemática");

        Turma turma = new Turma("T1", prof);

        Aluno a1 = new Aluno("João", "001", "ADS");
        Aluno a2 = new Aluno("Maria", "002", "ADS");

        turma.adicionarAluno(a1);
        turma.adicionarAluno(a2);

        Avaliacao av1 = new Avaliacao("Prova 1", "10/03");
        av1.adicionarNota(a1, 8.5);
        av1.adicionarNota(a2, 9.0);

        turma.adicionarAvaliacao(av1);

        turma.exibirDados();
    }
}