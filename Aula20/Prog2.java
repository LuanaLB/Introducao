//Exemplo de como passar parâmetros para o método main
//Para executar java Prog2 <aqui digite o que voce quer passar como parâmetro
public class Prog2 {
    public static void main(String[] args) {
        System.out.println("Olá mundo");

        for(String x: args){
            System.out.println(x);
        }
    }
}
