import java.util.Scanner;

public class Casa {
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);

        System.out.print("Digite um número de 1 dígito para calcular o fatorial: ");
        int numero = dd.nextInt();
        
        if (numero >= 0 && numero <= 9) {
            int fatorial = 1;
            
            for (int i = numero; i > 0; i--) {
                fatorial *= i;
            }
            
            System.out.println("Fatorial de " + numero + " => " + fatorial);
        } else {
            System.out.println("Por favor, insira um número de 1 dígito (entre 0 e 9).");
        }
    }
}
