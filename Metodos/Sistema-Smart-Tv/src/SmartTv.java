public class SmartTv{
//Está classe é o objeto TV
    boolean ligada = false; //Porque está desligada.
    int canal = 1;
    int volume = 25;

//criando métodos que manipulam um estado.

    public void aumentarVolume(){
        volume++; // O mesmo que: volume = volume + 1
    }

    public void diminuirVolume(){
        volume--; // O mesmo que: volume = volume - 1
    }

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false; //Porque colocamos false como sendo desligada.

    }

    public void aumentarCanal(){
       
        canal++;

    }

    public void diminuirCanal(){
       
        canal--;

    }

    public void mudarCanal(int novoCanal){
//Aqui surge um novo parametro (novo canal - como se perguntasse: Qual canal?)   
    canal = novoCanal;   
//Por que não imprimir aqui? Pois ele será chamado aqui e deixaremos o usuário decidir.

    }
}