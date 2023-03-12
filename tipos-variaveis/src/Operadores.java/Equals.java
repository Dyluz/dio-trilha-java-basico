public class Equals {
    
/* == versus equals: Existe uma relevância forte, em realizar 
comparações com == e equals na qual precisamos ter uma 
compreensão de quais as regras seguidas pela linguagem **** ,
exemplo:*/
     public static void main(String[] args) {
                
        int numero1 = 130;
        int numero2 = 130;
        
        System.out.println(numero1 == numero2); //true
            
        //Integer numero1 = 130;
        //Integer numero2 = 130;
    
        //System.out.println(numero1 == numero2); //false
            
            // A razão pela qual o resultado é false, é devido o Java tratar os valores
            // Como objetos a partir de agora.
            // Qual a solução ?
            // Quando queremos comparar objetos, usamos o método equals
            
            // System.out.println(numero1.equals(numero2)); 
    }
}
