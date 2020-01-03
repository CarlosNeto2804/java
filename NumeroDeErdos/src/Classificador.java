public class Classificador {
    private Autor[][] autores = new Autor[10][10];
    private boolean autorListado = false;

    //linhaTeste faz com que o loop não retorne às linhas anteriores
    private int linhaTeste = 0;

    /* 
    1) ver se P. Erdos está  na linha
    2) se estiver somar
    3) senao estiver verificar os outros integrantes possuem numero
    */

    public Classificador() {}

    public void imprimirAutores() {
        this.ordenarLista();
    }
    public void receberDados(String frase) {
        /* Ao receber dados fazer a separação das Strings */
        String fraseSemPonto = frase.substring(0, frase.length() - 1);
        String[] autor;
        autor = fraseSemPonto.split(", ");
        for (int i = 0; i < autor.length; i++) {
            this.criarAutor(autor[i], autor.length);
        }
        linhaTeste++;
    }

    public void criarAutor(String nomeSobrenomeJuntos, int coluna) {
        // o parametro coluna é até onde se pode adicionar autores em uma linha de acordo com a 
        // quantidade na linha para que outros autores não entrem nessa linha
        // Antes de criar fazer uma busca para atualização
        String[] nomeSobrenome = nomeSobrenomeJuntos.split(" ");
        for (int i = linhaTeste; i < this.autores.length && this.autorListado == false; i++) {
            for (int j = 0; j < coluna && this.autorListado == false; j++) {
                Autor auth = new Autor(nomeSobrenome[0], nomeSobrenome[1]);
                if (this.autores[i][j] == null) {
                    if (nomeSobrenome[0].equals("P.") && nomeSobrenome[1].equals("Erdos")) {
                        auth.setNumDeErdos(0);
                        this.autores[i][j] = auth;
                        this.autorListado = true;
                    } else {
                        this.autores[i][j] = auth;
                        this.calularNumDeErdos();
                        this.autorListado = true;
                    }
                }
            }
        }
        if (this.autorListado == true) {
            this.autorListado = false;
        }

    }
    

    public void calularNumDeErdos() {
        int numeroMenorDaLinha = 300000000;
        boolean erdosEstaNaLinha = false;
        for (int i = 0; i < this.autores.length; i++) {

            // SE ERDOS ESTIVER NA LINHA 
            for (int j = 0; j < this.autores[i].length && erdosEstaNaLinha == false; j++) {
                //verificar se a posição não está vazia e se erdos está na linha
                if (this.autores[i][j] != null && this.autores[i][j].getNumDeErdos() == 0) {
                    erdosEstaNaLinha = true;
                }
            }
            if (erdosEstaNaLinha) {
                for (int j = 0; j < this.autores[i].length; j++) {
                    if (this.autores[i][j] != null && this.autores[i][j].getNumDeErdos() != 0) {
                        this.autores[i][j].setNumDeErdos(1);
                    }
                }
                erdosEstaNaLinha = false;
            }

            //SE ERDOS NÃO ESTIVER
            else {
                for (int j = 0; j < this.autores[i].length; j++) {
                    if (this.autores[i][j] != null) {
                        //VERIFICAR SE O AUTOR JA EXISTE NA MATRIZ
                        for (int x = 0; x < this.autores.length; x++) {
                            for (int y = 0; y < this.autores[x].length; y++) {
                                if (this.autores[x][y] != null) {
                                    if (this.autores[i][j].equals(this.autores[x][y].getNome(), this.autores[x][y].getSobrenome())) {
                                        if (this.autores[i][j].getNumDeErdos() >= this.autores[x][y].getNumDeErdos()) {
                                            this.autores[i][j].setNumDeErdos(this.autores[x][y].getNumDeErdos());
                                        }
                                    }
                                }
                            }
                        }
						// Verifica o menor numero da linha do autor na posicao
                        if (this.autores[i][j].getNumDeErdos() < numeroMenorDaLinha) {
                            numeroMenorDaLinha = this.autores[i][j].getNumDeErdos();
                            for (int index = 1; index < this.autores[i].length; index++) {
                                if (this.autores[i][index] != null) {
                                    if (numeroMenorDaLinha > this.autores[i][index].getNumDeErdos()) {
                                        numeroMenorDaLinha = this.autores[i][index].getNumDeErdos();
                                    }
                                }
                            }
                        }
                    }
                }
                // Atribui o valor de erdos equivalente
                for (int j = 0; j < this.autores[i].length; j++) {
                    if (this.autores[i][j] != null && this.autores[i][j].getNumDeErdos() != numeroMenorDaLinha) {
                        this.autores[i][j].setNumDeErdos(numeroMenorDaLinha + 1);
                    }
                }
                numeroMenorDaLinha = 300000000;
            }
        }
    }

    

    public void ordenarLista() {
        this.calularNumDeErdos();
        int count = 0; // Contador auxiliar
		
        //copiar matriz no vetor
        Autor[] listaDeAutoresComRepeticao, arr;
        listaDeAutoresComRepeticao = new Autor[100];
		
        //verificar quantos nomes tem no total
        for (int linha = 0; linha < this.autores.length; linha++) {
            for (int coluna = 0; coluna < this.autores[linha].length; coluna++) {
                if (this.autores[linha][coluna] != null) {
                    listaDeAutoresComRepeticao[count] = this.autores[linha][coluna];
                    count++;
                }
            }
        }
        
        // Elimina os autores repetidos do vetor clonados da matriz
        for (int i = 0; i < listaDeAutoresComRepeticao.length; i++) {
            int k = i +1;
            if (listaDeAutoresComRepeticao[i] != null) {
                for (int j = i+1; j < listaDeAutoresComRepeticao.length; j++) {
                    if (listaDeAutoresComRepeticao[j] != null && listaDeAutoresComRepeticao[i] != null) {
                        if (listaDeAutoresComRepeticao[i].equals(listaDeAutoresComRepeticao[j].getNome(), listaDeAutoresComRepeticao[j].getSobrenome())) {
                            if (listaDeAutoresComRepeticao[i].getNumDeErdos()<listaDeAutoresComRepeticao[j].getNumDeErdos()) {
                                listaDeAutoresComRepeticao[j] = null;
                            }
                            else{
                                listaDeAutoresComRepeticao[i]=null;
                            }
                        }else{
                            listaDeAutoresComRepeticao[k++] = listaDeAutoresComRepeticao[j];          
                        }
                    }
                }
            }
        }

		// Verifica o numero de posicoes nao vazias do vetor para alocar o vetor com o tamanho correto de autores
        count = 0;
        for(int i=0; i< listaDeAutoresComRepeticao.length; i++){
            if(listaDeAutoresComRepeticao[i] != null){
                count++;
            }
        }

		// Aloca um novo vetor para efetuar ordenacao
        arr = new Autor[count];
        count = 0;
        for (int i = 0; i < listaDeAutoresComRepeticao.length; i++) {
            if (listaDeAutoresComRepeticao[i] != null && listaDeAutoresComRepeticao[i].getNumDeErdos() != 0) {
                arr[count++] = listaDeAutoresComRepeticao[i];
            }
        }

		// Ordenacao usando bubble sort    
        Autor aux;
        for(int i=0; i < count-1; i++){
            for(int j=0; j< count-1; j++){
                if(arr[j].compare(arr[j+1].getNome(), arr[j+1].getSobrenome())){
					aux = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = aux;	
				}
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
               arr[i].printAutor();
            }
        }
    }
}