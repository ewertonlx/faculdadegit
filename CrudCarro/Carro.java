package CrudCarro;
public class Carro {
    private String modelo;
    private int ano;
    private Carro proximo; // Referência ao próximo carro
    
    public Carro(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
        this.proximo = null;
    }

    public int getAno() {
        return ano;
    }

    public String getModelo() {
        return modelo;
    }

    public Carro getProximo() {
        return proximo;
    }

    public void setProximo(Carro proximo) {
        this.proximo = proximo;
    }
}
