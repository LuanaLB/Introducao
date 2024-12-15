/*
Faça um programa que solicite um valor inteiro ao
usuário e o programa deverá questionar e apresentar
uma das seguintes respostas:
- é menor que 10
- está entre 10 e 20 (inclusive)
- maior que 20 
obs: Fazer o código utilizando tabela verdade
*/

import java.util.Scanner;

public class Prog1{
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);

        System.out.print("Número: ");
        int num = dd.nextInt();
        if(num < 10 || num > 20){
            if(num < 10 )
                System.out.println(num + " é menor que 10");
            else
                System.out.println(num + " é maior que 10");
        }else{
            if(num >= 10 && num <=20){
                System.out.println(num + " está entre 10 e 20 (inclusive)");
            }
        }
    }
} 
