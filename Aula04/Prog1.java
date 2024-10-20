/*
Exemplo de criação de variáveis do tipo 
primitivo byte 
*/
public class Prog1{
   
    public static void main(String[] args) {
        byte x; //variavel local do tipo primitivo sem valor
        byte y=10; //variável local do tipo primitivo já inicializada
        byte z = 10, t=20, ax; //criação de várias variáveis locais do tipo primitivo na mesma linha de instrução

        //A instrução abaixo dá erro devido ao x não ter sido inicializado
        //System.out.println(x);
        System.out.println("O valor de y = "+y);

        //A instrução abaixo gera erro por tentar armazenar um valor superior a capacidade da variável de armazenar
        //byte abc = 200
        
       //somou 1+2 = obteve um valor do tipo
       //inteiro e o converteu para um tipo byte
       //Faz a conversão de um tipo para outro de
       //forma implícita
        byte ab = 1 + 2;
    }

}
/*
Toda literal inteira digitado no código 
o sistema o trata como um tipo int 
*/