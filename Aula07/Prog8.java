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
public class Prog8 {
  public static void main(String[] args) {
    Scanner dd = new Scanner(System.in);

    System.out.print("Número: ");
    int x = dd.nextInt();
    if(x >= 0)
        System.out.print(x + " é positivo ");
    if(x < 0) 
        System.out.print(x + " é negativo ");
    
    if(x %2 == 0)
        System.out.println("e par.");
    if(x % 2 != 0) 
        System.out.println("e impar.");
  }  
}
