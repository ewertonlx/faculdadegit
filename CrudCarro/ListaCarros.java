package CrudCarro;
public class ListaCarros {
    private Carro primeiro;

    public ListaCarros() {
        this.primeiro = null;
    }

    // Método para inserir um carro em ordem crescente de ano
    public void inserir(Carro novoCarro) {
        primeiro = inserirRecursivo(primeiro, novoCarro);
    }

    // Método recursivo para inserir o carro na posição correta
    private Carro inserirRecursivo(Carro atual, Carro novoCarro) {
        // Caso a lista esteja vazia ou o novo carro seja o mais antigo
        if (atual == null || novoCarro.getAno() < atual.getAno()) {
            novoCarro.setProximo(atual);
            return novoCarro;
        }
        // Continuar a busca recursivamente
        atual.setProximo(inserirRecursivo(atual.getProximo(), novoCarro));
        return atual;
    }

    // Método para buscar um carro pelo ano
    public Carro buscarPorAno(int ano) {
        return buscarRecursivo(primeiro, ano);
    }

    // Método recursivo para buscar um carro pelo ano
    private Carro buscarRecursivo(Carro atual, int ano) {
        if (atual == null) {
            return null; // Não encontrado
        }
        if (atual.getAno() == ano) {
            return atual; // Carro encontrado
        }
        return buscarRecursivo(atual.getProximo(), ano); // Continuar a busca
    }

    // Método para imprimir todos os carros
    public void listarCarros() {
        listarRecursivo(primeiro);
    }

    // Método recursivo para listar os carros
    private void listarRecursivo(Carro atual) {
        if (atual != null) {
            System.out.println(atual.getModelo() + " - " + atual.getAno());
            listarRecursivo(atual.getProximo());
        }
    }
}
