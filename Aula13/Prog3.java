import java.util.Scanner;

//Exemplo de como descobrir quantos caracteres tem uma string
public class Prog3 {
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);

        System.out.print("Palavra: ");
        String pl = dd.nextLine();

        int cont = pl.length();

        System.out.println(pl + " possui "+ cont + " caracteres.");
    }
}
