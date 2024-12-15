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
public class Prog3 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        double n1, n2, n3, n4, n5, media, maNota, meNota;

        System.out.print("Nota1: ");
        n1 = tec.nextDouble();
        maNota =n1;
        meNota = n1;
        

        System.out.print("Nota2: ");
        n2 = tec.nextDouble();
        if(n2 > maNota)
            maNota = n2;
        if(n2 < meNota)
            meNota = n2;
    
        System.out.print("Nota3: ");
        n3 = tec.nextDouble();
        if(n3 > maNota)
            maNota = n3;
        if(n3 < meNota)
            meNota = n3;

        System.out.print("Nota4: ");
        n4 = tec.nextDouble();
        if(n4 > maNota)
            maNota = n4;
        if(n4 < meNota)
            meNota = n4;

        System.out.print("Nota5: ");
        n5 = tec.nextDouble();
        if(n5 > maNota)
            maNota = n5;
        if(n5 < meNota)
            meNota = n5;

        media = (n1+n2+n3+n4+n5)/5;

        System.out.printf("Média %.1f\n", media);
        System.out.printf("Menor: %.1f\n", meNota);
        System.out.printf("Maior: %.1f\n", maNota);
    }    
}
