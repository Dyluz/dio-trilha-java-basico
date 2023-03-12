public class OperadorTernario {

    public static void main (String[] args){

    int a, b;
    
    a = 5;
    b = 6;

    String resultado = a==b ?"verdadeiro" : "falso";
    // Pode ser com resultado em int.

    System.out.println(resultado);

   /* Essa forma foi resumida mas pode ser assim tb...
    
    int a, b;
    a=5;
    b=6;

    String resultado = "";

    if (a==b)

    resultado = "verdadeiro";

    else

    resultado = "falso";

    System.out.println(resultado); */
}
};


/*O operador de condição ternária é uma forma resumida para 
definir uma condição e escolher por um dentre dois valores. 
Você deve pensar numa condição ternária, como se fosse uma 
condição IF normal, porém, de uma forma em que toda a sua 
estrutura estará escrita numa única linha.
O operador ternário é representado pelos símbolos "?" e ":" 
utilizados na seguinte estrutura de sintaxe:
<Expressão Condicional>`` ?``<Caso condição seja true>``: ``<Caso
condição seja false>*/
