public class OpArimetico2 {

    public static void main(String[] args) {
        String nomeCompleto = "Concatenando fica: " + " LINGUAGEM" + " JAVA";
        System.out.println(nomeCompleto);

/*ATENÇÃO: o operador de adição (+), quando utilizado em variáveis do
tipo texto, realizará a "CONCATENAÇÃO DE TEXTOS" */

    int numero = 5;
    int numero2 = 5;
    int numero3 = 5;
// x repetição;
    numero = numero + 2;
/* pode ser qq valor que se repetirá.*/
    System.out.println("N1 = " + numero);

     numero2 = numero2 +1;
  
    System.out.println("N2 = " + numero2);

    numero3++;
// Mesma coisa que numero3 = numero3 + 1
    System.out.println("N3 = " + numero3);

    System.out.println("N4 = " + numero3++);
/* Por que não 7? Pois primeiro ele imprimi e depois ele acrescenta.*/
    ++numero3;

    System.out.println("N5 = " + numero3);
/*Por que 8? Pois depois que ele imprimiu 6 ele acrescentou 1 
(ficou 7) e como pedimos para acrescentar +1 (++numero3) deu 8
(imprimindo de primeira). 
Mesma coisa com -- (decremento).
Isso para valores em 1. */

/* VALORES BOOLEANOS... */

        boolean variavel = true;

        /* Para negar ... */
        System.out.println("Para negar usamos ! : " + !variavel);
        /* Veja que não alterou. */
        System.out.println("Não alterei minha variável veja: " + variavel);
       
        /* E como alterar de fato? */

        variavel = !variavel;

        System.out.println("Variável alterada de fato veja : " + variavel);


    }
}
