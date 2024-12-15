import java.util.Scanner;

/*
Faça um programa que em tempo de execução seja 
informado a nota de 5 alunos e o programa 
informe na tela:
- a média da turma
- a menor nota
- a maior nota  
*/
//IMPLEMENTAÇÃO SEM LAÇO DE REPETIÇÃO
public class Prog4 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        double n[] = new double[5];
        double media=0, maNota=0, meNota=0;

        for (int i = 0; i < n.length; i++) {
            System.out.print("Nota["+i+"] ");
            n[i] = tec.nextDouble();
            if(i==0){
                maNota =n[i];
                meNota = n[i];
            }
            if(n[i] > maNota)
                maNota = n[i];
            if(n[i] < meNota)
                meNota = n[i];
            media +=n[i];
            
        }
        media /=5;

        System.out.printf("Média %.1f\n", media);
        System.out.printf("Menor: %.1f\n", meNota);
        System.out.printf("Maior: %.1f\n", maNota);
    }    
}
