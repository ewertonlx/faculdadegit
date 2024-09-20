package CrudCurriculo;

public class Curriculo {
    private String nome;
    private double nota;
    private Curriculo proximo; // Referência para o próximo currículo

    public Curriculo(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
        this.proximo = null;
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    public Curriculo getProximo() {
        return proximo;
    }

    public void setProximo(Curriculo proximo) {
        this.proximo = proximo;
    }
}

