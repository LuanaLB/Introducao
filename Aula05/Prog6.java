import java.util.Scanner;

public class Prog6 {
    public static void main(String[] args) {
        Scanner dd; //Classe Scanner é o teclado
        
        //Criando uma ligação entre o meu programa
        //e o teclado
        dd = new Scanner(System.in); 
        
        String nome;
        int idade;

        System.out.print("Informe seu nome: ");

        //Lendo as teclas pressionadas no teclado
        //e atribuino elas a variável nome
        nome = dd.nextLine(); 

        System.out.print("Informe sua idade: ");
        
        //Lendo as teclas pressionadas no teclado
        //e atribuino elas a variável idade
        idade = dd.nextInt();

        System.out.println(nome + " tem "+ idade +
        " anos.");
    }
}
