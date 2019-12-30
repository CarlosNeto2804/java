import java.util.*;

public class Pedido {
    public static int _id = 0;
    private int id;
    private Tempo tempo;
    private ArrayList<Item> itens = new ArrayList<Item>();

    public Pedido(int code, Tempo tempo) {
        this.id = code;
        this.tempo = tempo;
    }

    public int getID() {
        return this.id;
    }

    public Tempo getTempo() {
        return this.tempo;
    }
    public boolean adicionarItem(Item item) {
        this.itens.add(item);
        return true;
    }
    @Override
    public String toString() {
      String mgs ="{"+ this.id +", {"+ tempo.toString() +"}, "+itens.toString()+"}";
      return mgs;
    }
}