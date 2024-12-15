import java.util.Scanner;

/*
6. Faça um programa que substitua cada caracter de uma 
palavra (4 caracteres) pelo seu caracter seguinte no alfabeto. 
Se o caracter for z, substitua por a. 

Ex:

palavra: casa

resposta: dbtb 
*/
public class Prog6 {
    public static void main(String[] args) {
        

        Scanner dd = new Scanner(System.in);

        System.out.print("Palavra: "); 
        String pl = dd.nextLine(); 

        if(pl.length() != 4){
            System.out.println("Informe apenas palavras de 4 caracteres.");
            return;
        } 

        char c = pl.charAt(0);
        if(c == 'z')
            c='a';
        else 
            if(c == 'Z')
                c= 'A';
            else 
                c++;
        System.out.print(c);

        c = pl.charAt(1);
        if(c == 'z')
            c='a';
        else 
            if(c == 'Z')
                c= 'A';
            else 
                c++;
        System.out.print(c);

        c = pl.charAt(2);
        if(c == 'z')
            c='a';
        else 
            if(c == 'Z')
                c= 'A';
            else 
                c++;
        System.out.print(c);

        c = pl.charAt(3);
        if(c == 'z')
            c='a';
        else 
            if(c == 'Z')
                c= 'A';
            else 
                c++;
        System.out.println(c);
    }
}
