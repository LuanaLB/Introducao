import java.util.Scanner;

/*
 Faça uma aplicação de triagem de contratação de funcionário no qual o usuário
informe o nome, sexo e idade. Como parâmetro para seleção o programa deverá
selecionar apenas usuários do sexo feminino que possuam idade igual ou inferior
a 25 anos. Se os dados informados obedecerem esse filtro o programa deverá
apresentar a mensagem "SELECIONADO PARA SEGUNDA FASE"; caso contrário NÃO SELECIONADO 
*/

public class Prog1_1{
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);
        String nome;
        int idade;
        char sexo;

        System.out.print("Nome: ");
        nome = dd.nextLine();
        System.out.print("Idade: ");
        idade = dd.nextInt();
        System.out.print("Sexo(M/F): ");
        sexo = dd.next().toLowerCase().charAt(0);

        if(idade <= 25 && sexo == 'f')
            System.out.println("SELECIONADO PARA SEGUNDA FASE");
        else
            System.out.println("NAO SELECIONADO PARA SEGUNDA FASE");
    }
}