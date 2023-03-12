public class OperadorUnario {
    
    public static void main (String[] args){
        int numero = 5;

        numero = - numero; /*Somente desta forma o 
        tornará efetivamente negativo */
        // System.out.println(- numero); 
/*Não torna meu número realmente negativo apenas o 
imprimirá assim. Se nós reemprimirmos veremos que 
permanece positivo. */
        System.out.println(numero);
        
       /* numero = + numero; Não o tornará positivo caso 
    seja negativo para isso devemos multiplicá-lo por -1 */
        numero = numero * -1;
        System.out.println(numero);

    }
}

/* Unário - são aplicados juntamente com um outro operador aritmético.
 * Eles realizam alguns trabalhos básicos como incrementar, decrementar, 
 * inverter valores numéricos em boleanos. */