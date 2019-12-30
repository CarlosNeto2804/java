public class Tempo implements Comparable<Tempo> {
    private int hora;
    private int minutos;
    private int segundos;
    
    public Tempo (){ // constructor default
      this.hora = 0;
      this.minutos = 0;
      this.segundos = 0;
    }
    
    public Tempo(int hora, int minutos, int segundos){ //constructor with params
     if(hora<0||hora>23) throw new IllegalArgumentException("Valor da hora fora dos limitantes");
     else if(minutos<0||minutos>59) throw new IllegalArgumentException("Valor dos minutos fora dos limitantes");
     else if(segundos<0||segundos>59) throw new IllegalArgumentException("Valor dos segundos fora dos limitantes");
     else{
       this.hora = hora;
       this.minutos = minutos;
       this.segundos = segundos;
     }
    }
    
    public Tempo(Tempo t){ //constructor to copy
      this.hora = t.getHora();
      this.segundos = t.getSegundos();
      this.minutos = t.getMinutos();
    }
    //getters
    public int getHora(){return this.hora;}
    public int getMinutos(){return this.minutos;}
    public int getSegundos(){return this.segundos;}
    @Override
    public String toString(){
      return this.getHora()+ " hora(s), "+this.getMinutos()+" minuto(s) e "+this.getSegundos()+" segundo(s)";
    }
    @Override
    public int compareTo(Tempo tmp){
        if (tmp.totalSegundos()==this.totalSegundos()) return 0;
        else if (tmp.totalSegundos()<this.totalSegundos())return 1;
        else return -1;
    }
   
    public boolean equals(Tempo tmp){
      return (this.totalSegundos() == tmp.totalSegundos());
    }
    public int totalSegundos(){
     return (this.hora*3600)+(this.minutos * 60)+this.segundos;
    }
    
  }