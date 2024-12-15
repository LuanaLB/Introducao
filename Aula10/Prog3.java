/*
Faça um programa no qual o usuário informe um número(x) inteiro
e programa deverá apresentar uma das seguintes mensagens:

x é múltiplo de 2, de 3 e de 5
x é múltiplo apenas de 3 e 5
x é múltiplo apenas de 2 e 5
x é múltiplo apenas de 2 e 3
x é múltiplo apenas de 2
x é múltiplo apenas de 3
x é múltiplo apenas de 5
x não é múltiplo de 2 ou 3 ou 5
//Resolva a atividade usando tabela verdade
*/

import java.util.Scanner;

public class Prog3 {
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);
        
        System.out.print("Numero: ");
        int x = dd.nextInt();

        if(x %2 ==0 && x%3 ==0  && x%5==0){
            System.out.println(x + " é múltiplo de 2, de 3 e de 5");
            return;
        }
        if(x %2 !=0 && x%3 ==0  && x%5==0){
            System.out.println(x + " é múltiplo apenas de 3 e de 5");
            return;
        }

        if(x %2 ==0 && x%3 !=0  && x%5==0){
            System.out.println(x + " é múltiplo apenas de 2 e de 5");
            return;
        }
        if(x %2 ==0 && x%3 ==0  && x%5!=0){
            System.out.println(x + " é múltiplo apenas de 2 e de 3");
            return;
        }
        if(x %2 ==0 && x%3 !=0  && x%5!=0){
            System.out.println(x + " é múltiplo apenas de 2");
            return;
        }
        if(x %2 !=0 && x%3 ==0  && x%5!=0){
            System.out.println(x + " é múltiplo apenas de 3");
            return;
        }
        if(x %2 !=0 && x%3 !=0  && x%5==0){
            System.out.println(x + " é múltiplo apenas de 5");
            return;
        }
        System.out.println("Não é múltiplo 2 ou de 3 ou de 5");
        
    }
}
