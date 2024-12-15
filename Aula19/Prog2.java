import java.util.Scanner;

/*
Faça um programa que o usuário informe quantos 
números números será informado ao programa. 
O  programa deverá informar qual foi o maior 
número digitado dentre os números informados.  
*/
public class Prog2 {
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);

        System.out.print("Quantos numeros: ");
        int num = dd.nextInt();

        int n[] = new int[num];

        int maiorNum=0;

        for(int i=0; i < n.length; i++){
            System.out.print("Número[" + i + "] ");
            n[i] = dd.nextInt();
            if(i==0)
                maiorNum = n[i];
            else{
                if( maiorNum < n[i])
                    maiorNum = n[i];
            }
        }

        System.out.println("Listar números: FORMA1");
        for (int i = 0; i < n.length; i++) {
            System.out.println("Número[" + i + "] = "+n[i]);
        }

        System.out.println("Listar números: FORMA2");
        for (int x: n) {
            System.out.println("Número: = "+x);
        }

        System.out.println("O maior número: "+ maiorNum);
    }
}
