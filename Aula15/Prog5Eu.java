/*Fazer em casa:
Faça uma aplicação de triagem de contratação de funcionário 
no qual o usuário informe o nome, sexo e idade. Como parâmetro
para seleção o programa deverá selecionar apenas usuários do 
sexo feminino que possuam idade igual ou inferior a 25 anos. 
Se os dados informados obedecerem esse filtro o programa deverá 
apresentar a mensagem "SELECIONADO PARA SEGUNDA FASE"; caso 
contrário NÃO SELECIONADO
 */

import java.util.Scanner;

public class Prog5Eu {
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = dd.next();
        
        System.out.print("Digite a idade: ");
        long idade = dd.nextInt();
        
       System.out.print("Sexo (F/M): ");
        char sexo = dd.next().charAt(0);

        if (idade <= 25 || sexo == 'f' || sexo == 'F') {
            System.out.print(nome + " SELECIONADO (A) PARA SEGUNDA FASE");
        } else {
            System.out.print(nome + "NÃO SELECIONADO");
        }

    }
}