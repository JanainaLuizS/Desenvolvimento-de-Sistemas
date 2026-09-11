package alunos;

public class Aluno {
    private String nome;
    private String curso;
    private double nota;

    // Construtor
    public Aluno(String nome, String curso, double nota) {
        this.nome = nome;
        this.curso = curso;
        this.nota = nota;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    // Retorna a situação com base na nota
    public String verificarSituacao() {
       return (nota >= 7.0) ? "Aprovado" : "Reprovado";

    }

    // Exibe os dados do aluno
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Curso: " + curso);
        System.out.printf("Nota: %.2f", nota);
        System.out.println("\nSituação: " + verificarSituacao());
    }
}
