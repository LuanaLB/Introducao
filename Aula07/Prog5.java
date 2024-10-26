import java.util.Scanner;

/*
Faça um programa no qual o usuário digite um 
número inteiro e programa deverá informar se
o número digitado é par ou impar. 

*/
public class Prog5 {
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);

        System.out.print("Número: ");


        if(dd.nextInt() % 2 == 0)
            System.out.println(" é par.");
        else
            System.out.println(" é impar.");
        

    }    
}
