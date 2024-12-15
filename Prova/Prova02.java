package Prova;


import java.util.Scanner;

public class Prova02 {
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);
        
        System.out.println("Digite um numero de até 5 caracteres");
        int valor = dd.nextInt();

        if (valor.length() > 2) {
            System.out.println("Somente 2 caracteres!");
            return;
        } else {
            
        }
    }
}
