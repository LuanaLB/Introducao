import java.util.Scanner;

/*
Faça um programa no qual o usuário digite um
número inteiro e programa deverá informar se o
número digitado é par ou impar e se é positivo
ou negativo.
As respostas deverão ser:
positivo e impar
positivo e par
negativo e impar
negativo e par
*/
public class Prog9 {
  public static void main(String[] args) {
    Scanner dd = new Scanner(System.in);

    System.out.print("Número: ");
    int x = dd.nextInt();
    if(x >= 0){
        if(x%2 == 0)
            System.out.println(x + " é positivo e par");
        else
            System.out.println(x + " é positivo e impar");
    }else{ 
        if(x%2 == 0)
            System.out.println(x + " é negativo e par");
        else
            System.out.println(x + " é negativo e impar");
    }        
  }  
}
