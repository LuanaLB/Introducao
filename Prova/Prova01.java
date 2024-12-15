/*faça um programa que solicite uma palavra de até 4 caracteres 
e o programa deve apresentar a palavra com os caracteres 
em ordem alfabetica 

não pode haver laço de repetição 
não pode haver metodos que devolvem em ordem alfabetica

funciona se todos os caracteres estiverem em maiusculo
funciona se todos os caracteres estiverem em minusculo
funciona se os caracteres tiverem repetidos
funciona se já estiver em ordem alfabetica*/
package Prova;

import java.util.Scanner;

public class Prova01 {
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);

        System.out.print("Digite uma palavra de até 4 caracteres: ");
        String pl = dd.nextLine().toUpperCase();

        if (pl.length() > 4){
            System.out.println("Somente 4 caracteres!");
            return;
        } else {
           char[] caract = pl.toCharArray();

           char a = caract[0];
           char b = caract.length > 1 ? caract[1] : 0;
           char c = caract.length > 2 ? caract[2] : 0;
           char d = caract.length > 3 ? caract[3] : 0;

           if (a > b) { char temp = a; a = b; b = temp; }
           if (b > c) { char temp = b; b = c; c = temp; }
           if (c > d && d != 0) { char temp = c; c = d; d = temp; }
           if (a > b) { char temp = a; a = b; b = temp; }
           if (b > c) { char temp = b; b = c; c = temp; }
           if (a > b) { char temp = a; a = b; b = temp; }

           String plOrd = "" + a;
           if (b != 0) plOrd += b;
           if (c != 0) plOrd += c;
           if (d != 0) plOrd += d;

           System.out.println("Palavra ordenada: " + plOrd);
       }

    }
}
