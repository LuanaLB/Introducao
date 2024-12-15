import java.util.Scanner;

/*
Faça um programa que receba um número qualquer e 
apresente como resposta o somatório dos dígitos do 
número.
Ex: 1980
Resposta: 18 
*/

public class Atv{
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);

        System.out.print("Número: ");
        String num = dd.next(); //1980
        int soma=0;

        for (int i = 0; i < num.length(); i++) {
            soma += num.charAt(i) - '0';
        }

        System.out.println("Resultado: "+soma);
    }
}