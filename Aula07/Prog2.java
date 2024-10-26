import java.util.Scanner;

/*
Faça um programa no qual o usuário digite um 
número inteiro e programa deverá informar se
o número digitado é par ou impar. 

FORMA CLÁSSICA
*/
public class Prog2 {
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);

        System.out.print("Número: ");
        int x = dd.nextInt();

        if(x % 2 == 0){
            System.out.println(x + " é par.");
        }else{
            System.out.println(x + " é impar.");
        }

    }    
}
