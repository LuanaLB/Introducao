/* Faça um programa no qual crie uma variavel do tipo int chamada x com o valor 10.
Crie uma variável do tipo int chamada y com o valor 3;
Crie uma variavel do tipo float ou double chamada z  que armazene o valor de x/y
Imprima o valor de z na tela.
"Analise o código para ver se o valor de z impresso na tela:

- se apresenta a parte inteira e fracionária

- se apresenta apenas a parte inteira

- se apresenta a parte francionária, quantas casas de precisã
*/
public class Casa {
    public static void main(String[] args) {
        int x = 10;
        int y = 3;

        double z = (double) x / y;
      
        System.out.println("O valor de Z será: " + z);
    }
}
