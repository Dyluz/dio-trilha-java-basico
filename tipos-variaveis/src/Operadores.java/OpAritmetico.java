public class OpAritmetico {

    //qual o resultado das expressoes abaixo?

    public static void main(String[] args){  
/* com o ponto vermelho (break point) posso usar o modo debug */

        String concatenacao ="?"; 
/*Vai para aqui! ver resultado teclando F10 ou botão contornar */
        
        concatenacao = 1+1+1+"1"; 
/* Enquanto o próx. valor for numérico ele usará O OPERADOR DE ATRIBUIÇÃO
SOMA assim que se depara com um texto ele começa a CONCATENAR. */

        System.out.println(concatenacao);

    concatenacao = 1+"1"+1+1;

    System.out.println(concatenacao);

    concatenacao = 1+"1"+1+"1"; 
/*Encontrou um texto e fez a concatenação, permanecendo assim.*/

    System.out.println(concatenacao);

    concatenacao = "1"+1+1+1;

    System.out.println(concatenacao);

    concatenacao = "1"+(1+1+1); 
/*Por estar em evidência ele somou, encontrou o texto e concatenou à 
soma (pois considerou um caracter - veio depois de um caracter).  */
    
    System.out.println(concatenacao);
}
}
