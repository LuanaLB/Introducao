import java.util.Scanner;

/*
Exemplo de como tratar erros provocados por
entradas via teclado 
*/
public class Prog3 {
    public static void main(String[] args) {

        Scanner dd = new Scanner(System.in);

        boolean flag = true;
        String num=null;
        while(flag){ //for(;flag;)
            System.out.print("Digite sua idade: ");
            num = dd.next();
            char x[] = num.toCharArray();
            int i;
            for(i=0; i < x.length; i++){
                if(x[i] < '0' || x[i] > '9' ){
                    System.out.println("Digite apenas caracteres numericos");
                    break;
                }
            }
            if(i == x.length)
                flag = false;
        }

        //Convertendo String para número
        int id = Integer.parseInt(num);

        dd.nextLine(); //limpar o buffer do teclado 
        System.out.print("Digite seu nome: ");
        String nome = dd.nextLine();
    }
}
