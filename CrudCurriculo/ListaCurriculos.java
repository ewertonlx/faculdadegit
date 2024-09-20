package CrudCurriculo;

public class ListaCurriculos {
    private Curriculo primeiro;

    public ListaCurriculos() {
        this.primeiro = null;
    }

    // Método para inserir um currículo em ordem decrescente de nota
    public void inserir(Curriculo novoCurriculo) {
        primeiro = inserirRecursivo(primeiro, novoCurriculo);
    }

    // Método recursivo para inserir o currículo na posição correta
    private Curriculo inserirRecursivo(Curriculo atual, Curriculo novoCurriculo) {
        // Caso a lista esteja vazia ou o novo currículo tenha uma nota maior
        if (atual == null || novoCurriculo.getNota() > atual.getNota()) {
            novoCurriculo.setProximo(atual);
            return novoCurriculo;
        }
        // Continuar a busca recursivamente
        atual.setProximo(inserirRecursivo(atual.getProximo(), novoCurriculo));
        return atual;
    }

    // Método para buscar um currículo pela nota
    public Curriculo buscarPorNota(double nota) {
        return buscarRecursivo(primeiro, nota);
    }

    // Método recursivo para buscar um currículo pela nota
    private Curriculo buscarRecursivo(Curriculo atual, double nota) {
        if (atual == null) {
            return null; // Não encontrado
        }
        if (atual.getNota() == nota) {
            return atual; // Currículo encontrado
        }
        return buscarRecursivo(atual.getProximo(), nota); // Continuar a busca
    }

    // Método para listar todos os currículos
    public void listarCurriculos() {
        listarRecursivo(primeiro);
    }

    // Método recursivo para listar os currículos
    private void listarRecursivo(Curriculo atual) {
        if (atual != null) {
            System.out.println(atual.getNome() + " - Nota: " + atual.getNota());
            listarRecursivo(atual.getProximo());
        }
    }
}

