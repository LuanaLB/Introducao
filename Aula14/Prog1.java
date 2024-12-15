import java.util.Scanner;

/*
Um comerciante comprou um produto e quer vendê-lo com um
lucro de 45% se o valor de custo do produto for menor 
que 20,00.
Caso contrário, o lucro deverá ser de 30%.
O programa deverá pedir ao usuário o valor de custo do 
produto e como resultado o programa deverá apresentar o 
valor de venda do produto.

Faça uma solução com if-else - mostrando o valor de 
venda do produto

Faça uma solução usando ?: - mostrando o valor de venda 
do produto 
*/
public class Prog1 {
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);

        System.out.print("Custo do produto: ");
        double valor = dd.nextDouble();
        double valorFinal;

        if(valor < 20)
            valorFinal = valor * 1.45;   
        else
            valorFinal = valor * 1.30;
        
        System.out.printf("Resposta(if-else): %.2f\n",valorFinal);

        //USANDO OPERADOR TERNARIO
        valorFinal = (valor < 20)? valor * 1.45:valor * 1.30; 
        System.out.printf("Resposta(?:): %.2f\n",valorFinal);
    }
}
