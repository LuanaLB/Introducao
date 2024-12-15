import java.util.Scanner;

/*
 Faça uma aplicação no qual o usuário digite uma sigla do estado e programa
apresente na tela o nome do estado

RESOLUÇÃO: SWITCH-CASE
*/

public class Prog3{
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);

        System.out.print("Estado (SIGLA): ");
        String sigla = dd.next().toUpperCase();

        switch(sigla){
            case "TO":
                System.out.println("TOCANTINS");
                break;
            case "GO":
                System.out.println("GOIAS");
                break;
            case "MA":
                System.out.println("MARANHÃO");
                break;
            case "PA":
                System.out.println("PARA");
                break;
            default:
                System.out.println("SIGLA NAO RECONHECIDA");
        }
    }
}