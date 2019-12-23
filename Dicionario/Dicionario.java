public class Dicionario {
    private Termo[] termos;
    private int quantidadeTermos;

    public Dicionario() {
        this.termos = new Termo[25];
        this.quantidadeTermos = 0;
    }

    public boolean adicionaTermo(String palavra, String significado) {
        Termo termo = new Termo(palavra, significado);
        this.termos[quantidadeTermos] = termo;
        this.quantidadeTermos++;
        return true;
    }
    public String buscaSignificado(String palavra) {
        int inicioVetor =0;
        int fimDoVetor = this.quantidadeTermos -1;
        int meioDoVetor;
        String print = "Termo não encontrado!";
        boolean repetir = true;
        while (inicioVetor<=fimDoVetor&&repetir) {
            meioDoVetor = (inicioVetor+fimDoVetor)/2;
            if(this.termos[meioDoVetor]!=null && palavra.compareTo(termos[meioDoVetor].getPalavra())>0)
                inicioVetor = meioDoVetor +1;
            else if (this.termos[meioDoVetor]!=null&&palavra.compareTo(termos[meioDoVetor].getPalavra())<0) {
                fimDoVetor = meioDoVetor-1;
            }    
            else {
                print = this.termos[meioDoVetor].getSignificado();
                repetir = false;
            }
        }
        return print;
    }
}