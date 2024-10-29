package Aula09;

import java.util.Scanner;

public class Casa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita a idade do usuário
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        
        // Usa condições if-else para classificar a idade
        if (idade < 5 || idade > 80) {
            System.out.println("Idade inválida");
        } else if (idade >= 5 && idade <= 11) {
            System.out.println("Criança");
        } else if (idade >= 12 && idade <= 17) {
            System.out.println("Adolescente");
        } else if (idade >= 18 && idade <= 30) {
            System.out.println("Jovem");
        } else if (idade >= 31 && idade <= 59) {
            System.out.println("Adulto");
        } else if (idade >= 60 && idade <= 79) {
            System.out.println("Idoso");
        }
        
    }
}
