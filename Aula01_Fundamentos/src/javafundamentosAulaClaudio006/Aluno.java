package javafundamentosAulaClaudio006;

 class Aluno {
    String nome;
    int idade;
    double nota;

    // Construtor padrão (faltava esse)
    Aluno() {
    }

    Aluno(String nome) {
        this.nome = nome;
    }

    Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    Aluno(String nome, int idade, double nota) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }
}