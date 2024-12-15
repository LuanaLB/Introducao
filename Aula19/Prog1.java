import java.util.Scanner;

/*
Faça um programa no qual o usuário digite uma 
palavra de qualquer tamanho e o seu programa 
produza um relatório da seguinte foram:

- quantos carateres de "a" a "z" existe no texto informado pelo usuário
- quantos números 0 a 9
- quantos espaços em branco
- outros caracteres 

Ex: 
Ano de 1980
caracteres - 5
numeros - 4
espaços em branco - 2
outos - 2 
*/

public class Prog1{
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);

        System.out.print("Frase: ");
        //tocharArray -> gera um vetor do tipo
        //char através de uma string
        char fr[] = dd.nextLine().toCharArray();

        int contC_A_Z=0, contC_N=0, contE_B=0, contOut=0;
       
        for(int i=0; i < fr.length; i++){
            if(fr[i] == ' '){
                contE_B++;
                continue;
            }
            if((fr[i] >= 'a' && fr[i] <= 'z') ||
            (fr[i] >= 'A' && fr[i] <='Z')){
                contC_A_Z++;
                continue;
            }
            if(fr[i] >= '0' && fr[i] <= '9'){
                contC_N++;
                continue;
            }else
                contOut++;
        }

        System.out.println("RELATÓRIO");
        System.out.println("Caracteres A-Z: "+contC_A_Z);
        System.out.println("Carteres 0-9: "+ contC_N);
        System.out.println("Caracters espaço: "+contE_B);
        System.out.println("Outros tipos: "+contOut);

    }
}