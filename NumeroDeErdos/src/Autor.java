public class Autor {
    private String nome;
    private String sobrenome;
    private int numDeErdos; //INFINITO

    public Autor(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.numDeErdos = 100000000;
    }

    public String getNome() {
        return this.nome;
    }
    public String getSobrenome() {
        return this.sobrenome;
    }

    public int getNumDeErdos() {
        return this.numDeErdos;
    }
    public void setNumDeErdos(int numDeErdos) {
        this.numDeErdos = numDeErdos;
    }
    
    public boolean equals(String nome, String sobrenome) {
        return this.nome.equals(nome) && this.sobrenome.equals(sobrenome);
    }
    public boolean compare(String nome, String sobrenome) {
        int cmp = this.getSobrenome().compareToIgnoreCase(sobrenome);
        if (cmp > 0) return true;
        else if(cmp == 0){
            if(this.getNome().compareToIgnoreCase(nome) > 0) return true;
        }
        return false;
    }

    public void printAutor(){
        System.out.printf("%s %s: ", this.nome, this.sobrenome);
        if(this.numDeErdos == 100000000)
            System.out.printf("infinito\n");
        else
            System.out.printf("%d\n", this.numDeErdos);
    }
}