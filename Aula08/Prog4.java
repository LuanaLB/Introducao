import java.util.Scanner;

/*
Faça um programa no qual o usuário digite 3 
números e  o programa deverá informar qual foi
o maior número digitado. 
*/
public class Prog4 {
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);
        int n1,n2,n3, mValor=0;

        System.out.print("N1: ");
        n1 = dd.nextInt();

        System.out.print("N2: ");
        n2 = dd.nextInt();

        System.out.print("N2: ");
        n3 = dd.nextInt();

        if(n1 > n2)
            if(n1 > n3)
                mValor = n1;
        if(n2 > n1)
            if(n2 > n3)
                mValor = n2;
        if(n3 > n1)
            if(n3 > n2)
                mValor = n3;

        System.out.println("Maior numero: "+mValor);

    }    
}
