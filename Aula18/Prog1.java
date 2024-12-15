import java.util.Scanner;

/*
Faça um programa que armazene os 100 primeiros números
pares a partir de 100; 
*/
public class Prog1 {
    public static void main(String[] args) {
      
        int x[] = new int[100]; //criando o vetor

        //Preenchendo o vetor
        for (int i = 0, j=102; i < 100; i++, j+=2) {
            x[i] = j;   
        }

        //Imprimindo os elementos do vetor
        for(int i=0; i < 100; i++)
            System.out.println(x[i]);

    }
}
