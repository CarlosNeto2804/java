public class Item implements Comparable<Item> {
    private int id;
    private String nome;
    private String descricao;

    public Item(int codigo, String nome, String descricao) {
        this.id = codigo;
        this.nome = nome;
        this.descricao = descricao;
    }

    public int getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    @Override
    public String toString() {
        return "{" + this.getId() + ", " + this.getNome() + ", " + this.getDescricao() + "}";
    }

    public boolean equals(Item item) {
        return this.toString().equals(item.toString());
    }

    @Override
    public int compareTo(Item item) {
        if (this.toString().equals(item.toString()))
            return 0;
        else
            return this.getNome().compareTo(item.getNome());
    }

}