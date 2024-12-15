import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

/*
Faça um programa que solicite ao usuário que digite uma palavra especificamente de 
4 caracteres. O programa deverá gerar o seguinte relatório:
- número de vogais
- número de consoantes
- numero de caracteres números
- número de outros caracteres

Ex. 1$ca
1 vogal
1 consoante
1 caracter número
1 outros caracteres

Ex2: casa
2 vogal
2 consoante
0 caracter número
0 outros caracteres 
*/
public class Prog4 {
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);
    
        System.out.print("Palavra: ");
        String pl = dd.next();

        if(pl.length() !=4){
            System.out.println(pl + " não possui 4 caracteres.");
            return;
        }
        int nV=0, nC=0,nN=0, nO=0;
        char c1,c2,c3,c4;
        c1 = pl.toLowerCase().charAt(0);
        c2 = pl.toLowerCase().charAt(1);
        c3 = pl.toLowerCase().charAt(2);
        c4 = pl.toLowerCase().charAt(3);

        if(c1 >= '0' && c1 <= '9')
            nN++;
        else{ 
            if(c1 >= 'a' && c1 <= 'z'){
                if(c1 != 'a' && c1 !='e' && c1 != 'i' && c1 != 'o' && c1 != 'u')
                    nC++;
                else 
                    nV++;
            }else 
                nO++;
        }

        if(c2 >= '0' && c2 <= '9')
            nN++;
        else{ 
            if(c2 >= 'a' && c2 <= 'z'){
                if(c2 != 'a' && c2 !='e' && c2 != 'i' && c2 != 'o' && c2 != 'u')
                    nC++;
                else 
                    nV++;
            }else 
                nO++;
        }

        if(c3 >= '0' && c3 <= '9')
            nN++;
        else{ 
            if(c3 >= 'a' && c3 <= 'z'){
                if(c3 != 'a' && c3 !='e' && c3 != 'i' && c3 != 'o' && c3 != 'u')
                    nC++;
                else 
                    nV++;
            }else 
                nO++;
        }

        if(c4 >= '0' && c4 <= '9')
            nN++;
        else{ 
            if(c4 >= 'a' && c4 <= 'z'){
                if(c4 != 'a' && c4 !='e' && c4 != 'i' && c4 != 'o' && c4 != 'u')
                    nC++;
                else 
                    nV++;
            }else 
                nO++;
        }

        System.out.println("RELATÓIO:");
        System.out.println("Vogais: "+nV);
        System.out.println("Consoantes: "+nC);
        System.out.println("Números: "+nN);
        System.out.println("Outros caracteres: "+nO);

    }
}
