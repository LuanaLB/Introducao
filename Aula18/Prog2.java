import java.util.Scanner;

/*
Faça um progra que crie um vetor do tipo String
de 3 posições. O usuário deverá preencher o vetor
via classe Scanner

Após prencher o vetor imprima os dados do vetor
*/
public class Prog2 {
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);

        String nomes[] = new String[3];

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Nome["+(i+1)+"]: ");
            nomes[i] = dd.nextLine();
        }
        System.out.println("NOMES DIGITADOS:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
            
        }
    }
    
}
