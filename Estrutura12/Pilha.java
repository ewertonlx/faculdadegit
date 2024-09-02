package Estrutura12;
import java.util.ArrayList;
import java.util.List;

public class Pilha {
    private List<Curriculo> pilha;

    public Pilha() {
        pilha = new ArrayList<>();
    }

    public void push(Curriculo curriculo) {
        pilha.add(curriculo);
    }

    public Curriculo pop() {
        if (!pilha.isEmpty()) {
            return pilha.remove(pilha.size() - 1);
        } else {
            System.out.println("A pilha está vazia.");
            return null;
        }
    }

    public Curriculo peek() {
        if (!pilha.isEmpty()) {
            return pilha.get(pilha.size() - 1);
        } else {
            System.out.println("A pilha está vazia.");
            return null;
        }
    }

    public boolean isEmpty() {
        return pilha.isEmpty();
    }

    public Curriculo search(String nome) {
        for (int i = pilha.size() - 1; i >= 0; i--) {
            if (pilha.get(i).getNome().equalsIgnoreCase(nome)) {
                return pilha.get(i);
            }
        }
        System.out.println("Currículo não encontrado.");
        return null;
    }
    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        Curriculo curriculo1 = new Curriculo("João", "01/01/1990", "Engenharia", "5 anos na área", 8.5);
        Curriculo curriculo2 = new Curriculo("Maria", "05/05/1995", "Administração", "3 anos na área", 9.0);
        Curriculo curriculo3 = new Curriculo("Ana", "10/10/1985", "Medicina", "10 anos na área", 9.5);

        pilha.push(curriculo1);
        pilha.push(curriculo2);
        pilha.push(curriculo3);

        System.out.println("Currículo no topo: " + pilha.peek());

        Curriculo curriculoProcurado = pilha.search("Maria");
        if (curriculoProcurado != null) {
            System.out.println("Currículo encontrado: " + curriculoProcurado);
        }

        Curriculo removido = pilha.pop();
        System.out.println("Currículo removido: " + removido);

        System.out.println("A pilha está vazia? " + pilha.isEmpty());
    }
}
