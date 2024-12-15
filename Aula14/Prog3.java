import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

/*
Faça um programa que faça 5 perguntas para uma pessoa 
sobre o crime. As perguntas
são:
a - Telefonou para a vitima?
b - Esteve no local do crime?
c- Mora perto da vitima
d- Devia para a vitima?
e- Já trabalhou com a vitima?

OBS: DIGITE APENAS S/SIM OU N/NAO PARA AS RESPOSTAS
O programa ao final deve emitir uma classificação sobre 
a participação da pessoa no crime. 
Se a pessoa responder positivamente a 2 questões ela deve
ser classificada como "Suspeita" entre 3 e 4 como
 "Cumplice" e 5 "Assassino". Caso contrário, ele será
classificado como "Inocente"
*/ 

public class Prog3 {
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);

        int resp=0;
        System.out.print("Telefonou para a vitima? ");
        char r = dd.next().toLowerCase().charAt(0);
        if(r == 's')
            resp++;

        System.out.print("Esteve no local do crime? ");
        r = dd.next().toLowerCase().charAt(0);
        if(r == 's')
            resp++;
        
        System.out.print("Mora perto da vitima ");
        r = dd.next().toLowerCase().charAt(0);
        if(r == 's')
            resp++;

        System.out.print("Devia para a vitima? ");
        r = dd.next().toLowerCase().charAt(0);
        if(r == 's')
            resp++;

        System.out.print("Já trabalhou com a vitima? ");
        r = dd.next().toLowerCase().charAt(0);
        if(r == 's')
            resp++;

        if(resp == 2)
            System.out.println("Suspeito");
        else
            if(resp >=3 && resp <=4)
                System.out.println("Cumplice");
            else 
                if(resp == 5)
                    System.out.println("Culpado");
                else 
                    System.out.println("Inocente");

    }
}
