/*
ATIVIDADE2: Faça um programa que realize a 
decomposiçao de um número positivo de até três
dígitos a ser digitado por um usuário. 
Se o número for superior a 3 dígitos ou 
negativo o programa deverá ser encerrado.
Obs. Use exclusivamente if-else

Ex: valor 312

Resposta: 312 == 300 + 10 +2  
*/
//FORMA SIMPLES FAZER
import java.util.Scanner;

public class Prog3 {
    public static void main(String[] args) {
        int vDig, unid=0, dez=0, cent=0;
        Scanner dd = new Scanner(System.in);
    
        System.out.print("Número (<= 3 dígitos): ");
        vDig = dd.nextInt();
        
        cent = vDig/100 * 100;
        dez = (vDig - cent)/10 * 10;
        unid = vDig - cent -dez; 
        System.out.println(vDig + " = "+cent + " + "+dez+" + "+unid );
    }

}
