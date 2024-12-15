import java.util.Scanner;

/*
Atividade2: Faça um programa no qual o usuário digite 
um número de 1 digito e o seu programa deverá apresentar
o fatorial desse número:

Ex: Fatorial de 5 => 5 * 4* 3 *2 *1 = 120 
*/
public class Prog4 {
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);
        int num, fat=1;

        System.out.print("Número: ");
        num = dd.nextInt();
        if(num > 9){
            System.out.println("Número com dois ou mais dígitos.");
            return; //encerrar método
        }

        System.out.print("Fatorial de " +num + " => ");
        if(num == 9){
            fat *=9; //fat = fat * 9
            System.out.print(9);
        }
        if(num >= 8){
            fat *=8; 
            System.out.print(" * 8");
        }
        if(num >= 7){
            fat *=7; 
            System.out.print(" * 7");
        }        
        if(num >= 6){
            fat *=6; 
            System.out.print(" * 6");
        }
        if(num >= 5){
            fat *=5; 
            System.out.print(" * 5");
        }
        if(num >= 4){
            fat *=4; 
            System.out.print(" * 4");
        }
        if(num >= 3){
            fat *=3; 
            System.out.print(" * 3");
        }
        if(num >= 2){
            fat *=2; 
            System.out.println(" * 2 == "+fat);
        }

    }
}
