import java.util.Scanner;

/*
5. Faça um programa que mostre quais os valores da tabela
ASCII está associado a cada caracter de uma palavra de
 4 caractere digitada por um usuário.

Ex: palavra: ifto

i = 105

f = 102

t = 116

o = 111 
*/
public class Prog5 {
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);

        System.out.print("Palavra: "); 
        String pl = dd.nextLine(); 

        if(pl.length() != 4){
            System.out.println("Informe apenas palavras de 4 caracteres.");
            return;
        }

        char c = pl.charAt(0);
        System.out.println(c + " = " + (int)c);
        c = pl.charAt(1);
        System.out.println(c + " = " + (int)c);
        c = pl.charAt(2);
        System.out.println(c + " = " + (int)c);
        c = pl.charAt(3);
        System.out.println(c + " = " + (int)c);

        //Exemplo de como ver qual caracter está associado
        //a um número na tabela ascii
        int x = 100;
        System.out.println((char)x);
    }
}
