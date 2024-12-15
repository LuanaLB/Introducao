import java.util.Scanner;

/*
4. Faça um programa que inverta uma palavra de 
4 caracteres; 

Ex: palavra: ifto
resposta: otfi 
*/
public class Prog4 {
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);

        System.out.print("Palavra: ");
        String pl = dd.nextLine();

        if(pl.length() != 4){
            System.out.println("Informe apenas palavras de 4 caracteres.");
            return;
        }

        System.out.print(pl.charAt(3));
        System.out.print(pl.charAt(2));
        System.out.print(pl.charAt(1));
        System.out.println(pl.charAt(0));

    }
    
}
