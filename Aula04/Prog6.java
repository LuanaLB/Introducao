/*
Faça um programa que crie variáveis para
armazenar os dados de uma pessoa:
dados:
nome
cpf
endereço
idade
sexo= M/F

Crie as variáveis para armazenar os dados e
depois imprima na tela:
Nome: Helder Cleber Almeida Pereira
*/
public class Prog6 {

    public static void main(String[] args) {

        String nome = "Helder Cleber Almeida Pereira";
        String cpf = "999.999.999-99";
        int idade = 56;
        char sexo = 'M';

        System.out.println("Nome: "+nome);
        System.out.println("CPF: "+cpf);
        System.out.println("Idade: "+idade);
        System.out.println("Sexo: "+sexo);

        //Exemplo de como colocar o comando acima em uma única instrução
        //System.out.println("Nome: "+nome+"\n"+
        //"CPF: "+cpf+"\n"+"Idade: "+idade+"\n"+
        //"Sexo: "+sexo);

    }
}
