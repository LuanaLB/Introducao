/*
Faça um programa para que ao analisar dois números (x e y)
e forneça uma das seguintes respostas:
x é maior que y
x é menor que y
x é igual a y
O número de x e y deve ser informado pelo usuáro
obs: resolvam usando tabela verdade
*/

import java.util.Scanner;

public class Prog2 {
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);

        System.out.print("N1: ");
        int x = dd.nextInt();

        System.out.print("N2: ");
        int y = dd.nextInt();

        //resolução sem tabela verdade
        if(x != y){
            if(x > y)
                System.out.println(x + " é maior que " +y);
            else 
                System.out.println(x + " é menor que " +y);
        }else
            System.out.println(x + " é igual " +y);

        //resolução usando tabelas verdades
        if(x > y || x < y){
            if(x > y)
                System.out.println(x + " é maior que " +y);
            else 
                System.out.println(x + " é menor que " +y);
        }else
            System.out.println(x + " é igual " +y);

    }
}
