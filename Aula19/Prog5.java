/*
Faça um programa que determine qual o maior valor 
do vetor já preenchido
int x[] = {10, 4, 5, 199 , 80 7}
- a média dos números
- menor número
- maior número  
*/

public class Prog5{
    public static void main(String[] args) {
        int x[] = {10, 4, 5, 199 , 80, 7};
        double media=0;
        int maior=0, menor=0;

        System.out.println("ELEMENTOS DO VETOR");
        for(int y: x){
            System.out.print(y+"\t");
        }
        System.out.println();

        for (int i = 0; i < x.length; i++) {
            media +=x[i]; // media = media + x[i];
            if(i==0){
                maior = x[i];
                menor = x[i];
                continue;
            }
            if(x[i] > maior)
                maior = x[i];
            
            if(x[i] < menor)
                menor = x[i];

        }

        media /=x.length; // media = media /x.length
        System.out.printf("Media %.1f\n",media);
        System.out.println("Maior: "+maior);
        System.out.println("Menor: "+menor);
    }
}