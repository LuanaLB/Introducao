import java.util.Scanner;

/*
 Faça uma aplicação no qual o usuário digite uma sigla do estado e programa
apresente na tela o nome do estado

RESOLUÇÃO: IF-ELSE
*/

public class Prog2{
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);

        System.out.print("Estado (SIGLA): ");
        String sigla = dd.next().toUpperCase();

        if(sigla.equals("TO"))
            System.out.println("TOCANTINS");
        else
            if(sigla.equals("GO"))
                System.out.println("GOIAS");
            else 
                if(sigla.equals("MA"))
                    System.out.println("MARANHÃO");
                else 
                    if(sigla.equalsIgnoreCase("PA"))
                        System.out.println("PARA");
                    else 
                        System.out.println("SIGLA NAO RECONHECIDA");
    }
}