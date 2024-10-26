import java.util.Scanner;

/*
Faça um programa no qual o usuário digite um 
número inteiro e programa deverá informar se
o número digitado é par ou impar. 

*/
public class Prog4 {
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);

        System.out.print("Número: ");
        int x = dd.nextInt();

        //Quando se possui apenas uma instrução
        //dentro do if ou do else o uso das chaves
        //é opcional
        if(x % 2 == 0){
            System.out.println(x + " é par.");
        }
        if(x % 2 != 0 )
            System.out.println(x + " é impar.");
        

    }    
}
