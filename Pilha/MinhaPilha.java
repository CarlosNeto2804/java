
public class MinhaPilha<T> implements Pilha<T> {

    private int quantidade;
    private T[] pilha;

    @SuppressWarnings("unchecked")
    public MinhaPilha() {
        this.quantidade = 0;
        this.pilha = (T[]) new Object[10];
    }

    @Override
    public void push(T elemento) {
        if (quantidade < 0) {
            return;
        }
        if (elemento.equals("(")) {
            if (this.quantidade >= pilha.length) {
                dobraCapacidade();
            }
            this.pilha[this.quantidade] = elemento;
            this.quantidade++;
        } else if (elemento.equals(")")) {
            pop();
        } else {
            return;
        }
    }

    @Override
    public T pop() {
        if (quantidade > 0) {
            T temporario = this.pilha[this.quantidade - 1];
            this.pilha[this.quantidade - 1] = null;
            this.quantidade--;
            return temporario;
        } else {
            this.quantidade--;
            return null;
        }
    }

    @Override
    public boolean isEmpty() {
        if (this.quantidade == 0) {
            return true;
        } else {
            return false;
        }
    }

    @SuppressWarnings("unchecked")
    public void dobraCapacidade() {
        T[] aux = (T[]) new Object[2 * this.quantidade];
        for (int i = 0; i < this.quantidade; i++) {
            aux[i] = this.pilha[i];
        }
        this.pilha = aux;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "Correto";
        } else {
            return "Incorreto";
        }
    }
}
