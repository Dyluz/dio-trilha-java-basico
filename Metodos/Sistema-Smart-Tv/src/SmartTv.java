public class SmartTv{
//Esta classe é o objeto TV
    boolean ligada = false; //Porque declaramos: está desligada.
    int canal = 1;
    int volume = 25;

//Criando métodos que manipulam um estado.

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
        ligada = false; //Porque colocamos ligada como false tornando-se  desligada.

    }

    public void aumentarCanal(){
       
        canal++;

    }

    public void diminuirCanal(){
       
        canal--;

    }

    public void mudarCanal(int novoCanal){
//Aqui surge um novo parâmetro (novo canal - como se perguntasse: Qual canal?)   
    canal = novoCanal;   


    }
}