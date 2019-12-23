public class Termo {
  
    //atributes
    private String palavra;
    private String significado;
    
    //methods

    /* getters */
    public Termo(String palavra, String significado){
        this.palavra = palavra;
        this.significado = significado;
    }
    
    public String getPalavra(){
        return this.palavra;
    }
    public String getSignificado(){
        return this.significado;
    } 
}