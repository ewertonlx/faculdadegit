package CrudCarro;
public class Main {
    public static void main(String[] args) {
        ListaCarros lista = new ListaCarros();

        // Inserir carros
        lista.inserir(new Carro("Fiat Uno", 2010));
        lista.inserir(new Carro("Chevrolet Onix", 2018));
        lista.inserir(new Carro("Volkswagen Golf", 2015));
        lista.inserir(new Carro("Honda Civic", 2020));

        // Listar os carros
        System.out.println("Lista de carros em ordem crescente de ano:");
        lista.listarCarros();

        // Buscar um carro pelo ano
        int anoPesquisa = 2015;
        Carro carroEncontrado = lista.buscarPorAno(anoPesquisa);
        if (carroEncontrado != null) {
            System.out.println("\nCarro encontrado: " + carroEncontrado.getModelo() + " - " + carroEncontrado.getAno());
        } else {
            System.out.println("\nCarro com ano " + anoPesquisa + " não encontrado.");
        }
    }
}
