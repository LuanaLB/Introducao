/*Faça um programa que receba três números a ser informado 
pelo usuário e o programa deverá me apresentá-los em ordem 
crescente. Ex: n1 = 5 n2 = 3 e n3=18
resposta: 3 > 5 > 18 */

import java.util.Scanner;

public class Casa{
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);
        int valor01, valor02, valor03, valor;

        System.out.println("-------- Digite 3 numeros --------");
        System.out.print("N1: ");
        valor01 = dd.nextInt();
        valor = valor01;

        System.out.print("N2: ");
        valor02 = dd.nextInt();
        valor = valor02;

        System.out.print("N3: ");
        valor03 = dd.nextInt();
        if(valor01 > valor02){
            valor = valor01;
            valor01 = valor02;
            valor02 = valor;
        } if (valor02 > valor03) {
            valor = valor02;
            valor02 = valor03;
            valor03 = valor;
        } if (valor01 > valor02) {
            valor = valor01;
            valor01 = valor02;
            valor02 = valor;
        }

        System.out.println("Resultado em ordem crescente: " + valor01 + " " + valor02 + " " + valor03); 
    }
}