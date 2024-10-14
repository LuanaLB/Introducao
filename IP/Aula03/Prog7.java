//Criando variáveis e imprimindo na tela
public class Prog7 {
    public static void main(String[] args) {
        int x = 10; //crinado uma variável
        int y = 4; 

        /*
        10
        10 + " + " => "10 + "
        "10 + " +y => "10 + 2"
        "10 + 2 "+ " = " => "10 + 2 = "
        (10 +2 ) => 12
        "10 + 2 = " + 12 => "10 + 2 = 12"
        */
        System.out.println(x + " + " + y + " = "+ (x+y));
        System.out.println(x + " - " + y + " = "+ (x-y));
    }
}
