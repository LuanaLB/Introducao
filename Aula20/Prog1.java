/*
Exemplo de laços: for, while, do-while
Imprimindo de 1 a 5 
*/

public class Prog1{
    public static void main(String[] args) {
        for(int i=8; i <=5; i++) //for(;;)
            System.out.println("FOR *** "+i);

        int i=8;

        while(i <=5){ //while(true)
          System.out.println("WHILE *** "+i);
          i++;
        }

        i=8;
        do{
            System.out.println("DO-WHILE *** "+i);
            i++;
        }while(i <=5); //while(true)
    }
}