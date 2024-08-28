public class Carro {
    // Classe Carro
    private String modelo;
    private String marca;
    private int ano;
    private int preco;

    public Carro(String modelo, String marca, int ano, int preco) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    public int getPreco() {
        return preco;
    }
}