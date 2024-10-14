/*
Exemplo de como fazer uma operação de soma 
*/
public class Prog5 {
    public static void main(String[] args) {
        /*
         "2 + 2 = "+2
         "2 + 2 = 2"
         "2 + 2 = 2" + 2
         "2 + 2 = 22"
        */
        System.out.println("2 + 2 = "+2+2);

        /*
        Foma correta:
        (2+2) = 4
        "2 + 2 = "+ 4
        "2 + 2 = 4" 
        obs: sinal de + dentro do parênteses = somar
        sinal de + fora do parênteses é concatencar
        */
        System.out.println("Println: 2 + 2 = "+(2+2));

        //Fazendo a mesma operação com print
        System.out.print("Print: 2 + 2 = "+(2+2)+"\n");

        //Imprimindo a mensagem com printf
        //%d vai ser substituído pelo resultado da operação 2+2
        System.out.printf("Printf: 2 + 2 = %d\n",2+2);

    }
}
