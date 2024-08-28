public class Fila<T> {
    private T[] fila;
    private int frente;
    private int traseira;
    private int tamanho;
    private int capacidade;

    public Fila(int capacidade){
        this.capacidade = capacidade;
        fila = (T[]) new Object[capacidade];
        frente = 0;
        traseira = -1;
        tamanho = 0;
    }

    public void insert(T item){
        if (tamanho == capacidade){
            System.out.println("Fila cheia!");
            return;
        }
        traseira = (traseira + 1) % capacidade;
        fila[traseira] = item;
        tamanho++;
    }

    public T remove(){
        if (tamanho == 0){
            System.out.println("Fila vazia!");
            return null;
        }
        T item = fila[frente];
        fila[frente] = null;
        tamanho--;
        return item;
    }

    public void search(String modelo){
        for (int i = 0; i < fila.length; i++){
            T item = fila[(frente + i) % capacidade];
            if (item instanceof Carro){
                Carro carro = (Carro) item;
                if (carro.getModelo().equals(modelo)){
                    System.out.println("Modelo encontrado!" + carro.getModelo() + " " + carro.getMarca() + " " + carro.getAno() + " " + carro.getPreco()); 
                    return;
                }
            }
        }
        System.out.println("Modelo não encontrado!");
    }

    public static void main(String[] args) {
        Fila<Carro> fila = new Fila<>(5);
        Carro carro = new Carro("Fusca", "Volkswagen", 1970, 5000);
        fila.insert(carro);
        fila.search("FF");
    }
}






