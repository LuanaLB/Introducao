import java.util.Scanner;

/*
1. Faça um programa para descobrir se a letra inicial de 
uma palavra é maiúscula ou minúscula? 
*/

public class Prog1{
    
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);

        System.out.print("Palavra: ");
        String pl = dd.nextLine();

        char c = pl.charAt(0); //fiz uma copia do primeiro caracter

        if(c >=65 && c <= 90) //helder
            System.out.println("Inicial maiúscula");
        else 
            System.out.println("Inicial minúscula");
    }
}