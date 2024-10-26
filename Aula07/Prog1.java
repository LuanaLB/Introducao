import java.util.Scanner;

/*
Faça um programa para verificar se o número
digitado pelo usuário é positivo ou negativo 
*/
public class Prog1 {
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);

        System.out.print("Número: ");
        int x = dd.nextInt();

        if(x >= 0){ //se verdadeiro
            System.out.println(x +" é positivo.");
        }else{ //se falso
            System.out.println(x + " é negativo.");
        }
        dd.close();
    }
}
