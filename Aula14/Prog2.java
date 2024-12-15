import java.util.Scanner;

/*
Faça um programa que apresente o seguinte menu:

1 - Somar
2 - Subtrair
3- Multiplicar
4 - Dividir
5 - Resto da divisão
6- Sair

Após a escolha da opção, peça para o usuário digitar 
dois valores (exceto se opção 6) e apresente o resultado 
da operação na tela.

Faça o programa usando switch-case 
*/
public class Prog2 {
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);
        String menu = "1 - Somar\n"+
                      "2 - Subtrair\n"+
                      "3 - Multiplicar\n"+
                      "4 - Dividir\n"+
                      "5 - Resto da divisão\n"+
                      "6 - Sair\n"+
                      "Opção: ";
        
        System.out.print(menu);
        int op = dd.nextInt();  
        if(op == 6)
            return;
        
        System.out.print("Operador1: ");
        double num1 = dd.nextInt();

        System.out.print("Operador2: ");
        double num2 = dd.nextInt();

        switch(op){
            case 1:
                System.out.println(num1 + " + " + num2 +" = "+ (num1+num2) );
                break;
            case 2:
                System.out.println(num1 + " - " + num2 +" = "+ (num1-num2) );
                break;
            case 3:
                System.out.println(num1 + " x " + num2 +" = "+ (num1*num2) );
                break;
            case 4:
                System.out.printf("%.1f / %.1f = %.2f\n",num1,num2,num1/num2);
                break;
            case 5:
                System.out.println(num1 + " % " + num2 +" = "+ (num1%num2) );
                break;
        }

    }
    
}
