package Estrutura12;
public class Curriculo {
    private String nome;
    private String dataNascimento;
    private String formacao;
    private String experiencias;
    private double nota;

    public Curriculo(String nome, String dataNascimento, String formacao, String experiencias, double nota) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.formacao = formacao;
        this.experiencias = experiencias;
        this.nota = nota;
    }
    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getFormacao() {
        return formacao;
    }

    public String getExperiencias() {
        return experiencias;
    }

    public double getNota() {
        return nota;
    }
}