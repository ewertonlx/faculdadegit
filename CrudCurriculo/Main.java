package CrudCurriculo;

public class Main {
    public static void main(String[] args) {
        ListaCurriculos lista = new ListaCurriculos();

        // Inserir currículos
        lista.inserir(new Curriculo("João", 8.5));
        lista.inserir(new Curriculo("Maria", 9.0));
        lista.inserir(new Curriculo("José", 7.0));
        lista.inserir(new Curriculo("Ana", 9.5));

        // Listar os currículos
        System.out.println("Lista de currículos em ordem crescente de nota:");
        lista.listarCurriculos();

        // Buscar um currículo pela nota
        double notaPesquisa = 7.0;
        Curriculo curriculoEncontrado = lista.buscarPorNota(notaPesquisa);
        if (curriculoEncontrado != null) {
            System.out.println("\nCurrículo encontrado: " + curriculoEncontrado.getNome() + " - " + curriculoEncontrado.getNota());
        } else {
            System.out.println("\nCurrículo com nota " + notaPesquisa + " não encontrado.");
        }
    }
}
