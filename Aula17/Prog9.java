import java.util.Scanner;

/*
Faça um programa que construa uma nova palavra a 
partir da palavra digitada pelo usuário. 

A nova palavra deverá ser a junção das vogais 
seguida da junção das consoantes.

ex: casa

resposta aacs 
ATIVIDADE PARA CASA - AULA13
*/
public class Prog9 {
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);
        
        System.out.print("Palavra: ");
        String pl = dd.next();
        
        //plV -> armazena as vogais
        //plC -> armazena as consoantes
        String plV="", plC="";

        //cmp -> palavra digitada totalmente minúscula
        String cmp = pl.toLowerCase();

        for(int i=0; i < pl.length(); i++){
            if(cmp.charAt(i) == 'a' || cmp.charAt(i) == 'e'  ||
            cmp.charAt(i) == 'i' || cmp.charAt(i) == 'o' ||
            cmp.charAt(i) == 'u' )
                plV+=pl.charAt(i);
            else 
                plC+= pl.charAt(i);

        }

        System.out.println("Resposta: "+plV + plC);

    }
}
