import java.util.Scanner;

/*
2. Faça um programa para descobrir se uma palavra inicia 
com vogal ou consoante. 
*/
public class Prog2 {
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);

        System.out.print("Palavra: "); 
        String pl = dd.nextLine(); //Ifto
            //pl = "Ifto"
            //pl.toLowerCase = "ifto"
            //.charAt(0) = 'i'
        char c = pl.toLowerCase().charAt(0);
    
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' ||
        c == 'u')
            System.out.println("Inicia com vogal");
        else 
            System.out.println("Inicia com consoante");

    }
    

}
