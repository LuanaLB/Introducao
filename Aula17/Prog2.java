import java.util.Scanner;

//Exemplo para adivinha a senha
public class Prog2 {
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);

        String senha = "12345";

        for(int i=0; i<=3; i++){
            if(i==3){
                System.out.println("Conta bloqueada");
                System.out.println("Errou a senha 3 vezes"); 
                break; //sair do laço   
            }
            System.out.print("Senha: ");
            String s = dd.next();
            if(senha.equals(s)){
                System.out.println("acesso liberado");
                break; //sair do laço
            }else{
                System.out.println("Senha inválida");
            }
            
        }
    }
}
