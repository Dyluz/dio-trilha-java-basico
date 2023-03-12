public class Usuario { //Esta classe é o usuário interagindo.
    public static void main(String[] args) throws Exception {
   
//Considerações Iniciais

        SmartTv smartTv = new SmartTv();
/* O 1º SmartTv é como se fosse um int,String,... 
Aqui nomeamos como smartTv e criamos um novo SmartTv (Orient. a obj.) e criamos uma classe p/ilustrar a interação dos métodos, atributos, etc.*/
        System.out.println("A Tv está ligada? " + smartTv.ligada);
        System.out.println("Em qual canal está? " + smartTv.canal);
        System.out.println("Qual o volume da Tv? " + smartTv.volume);
//Ao digitar Sys selecione no menu suspenso sysout para auto-completar imprimir, se desejar.
    
//Ligando/Desligando a TV

        smartTv.ligar();

        System.out.println("Novo status - A Tv está ligada? " + smartTv.ligada);

        smartTv.desligar();

        System.out.println("Novo status - A Tv está ligada? " + smartTv.ligada);

        smartTv.ligar();

        System.out.println("Novo status - A Tv está ligada? " + smartTv.ligada);

//Aumentando/Diminuindo volume

        smartTv.diminuirVolume();

        System.out.println("O volume está agora no: " + smartTv.volume);

        smartTv.aumentarVolume();

        System.out.println("O volume está agora no: " + smartTv.volume);

        smartTv.aumentarVolume();

        System.out.println("O volume está agora no: " + smartTv.volume);

//Aumentando/Diminuindo ou mudando canal

    smartTv.aumentarCanal();

    System.out.println("O canal está agora no: " + smartTv.canal);

    smartTv.diminuirCanal();

    System.out.println("O canal está agora no: " + smartTv.canal);

    smartTv.mudarCanal(20);

    System.out.println("O canal está agora no: " + smartTv.canal);

    smartTv.mudarCanal(40);

    System.out.println("O canal está agora no: " + smartTv.canal);
     }
}
