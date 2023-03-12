public class ComparacaoAvancada {
      
        public static void main(String[] args) {
        
            String nome1 = "JAVA";
            String nome2 = "JAVA";
            
            System.out.println(nome1 == nome2); //true
    
            String nome3 = new String("JAVA");
            
            System.out.println(nome1 == nome3); //false
    
            String nome4 = nome3;
    
            System.out.println(nome3 == nome4); //true
            
            //EQUALS COMPARA CONTEÚDOS quando estivermos falando 
            //      +de objetos ou textos. Pesquisa: estrutura stak x rip
            System.out.println(nome1.equals(nome2)); //??
            System.out.println(nome2.equals(nome3)); //??
            System.out.println(nome3.equals(nome4)); //??
       
    }
}

 /* Comparações avançadas: Quando se refere a comparação 
        de conteúdos na linguagem, devemos ter um certo domínio, 
        de como o Java trata o armazenamento destes valores na 
        memória.
        Quando estiver mais familiarizado com a linguagem, 
        recomendamos se aprofundar no conceito de espaço em 
        memória Stack versus Heap. Vamos a alguns exemplos para ilustrar:
        Valor e referência: Precisamos entender que em Java tudo 
        é objeto, logo, objetos diferentes podem ter as mesmas 
        características, mas lembrando, são objetos diferentes.*/
        