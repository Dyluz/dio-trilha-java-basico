public class SmartTv{ //Esta classe é o objeto TV.
/*Nossa classe possue 3 características (logo abaixo) e elas são a 
níveis da classe. Toda a minha classe pode acessar.*/

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
/*Aqui surge um novo parâmetro (novo canal - como se perguntasse: 
Qual canal?).*/   
    canal = novoCanal;   
/* A variável mudarCanal consegue acessar a variável canal pois é da 
 * classe SmartTv. Já o novoCanal não é acessado fora da classe mudarCanal.*/
    }
}