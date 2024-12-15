/*
VALE 4 PTS
Faça um programa que determine qual o maior 
digito do número digitado
*/

import java.util.Scanner;

public class Prog10 {
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);
        
        System.out.print("Número: ");
        String num = dd.next();
        String maiorD="";

        for(int i=0; i < num.length(); i++){
            if(i==0){
                maiorD += num.charAt(i);
                continue;
            }
            if(maiorD.charAt(0) < num.charAt(i)){
                maiorD="";
                maiorD += num.charAt(i);
            }

        }
        System.out.println("Maior digito de "+num + " == "+maiorD);
    }
}
