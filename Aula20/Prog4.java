import java.util.Scanner;

/*
Faça um programa que solicite ao usuário que digite
o nome a idade, cpf e salario
O programa deverá aceitar para nome apenas 
caracteres de A a Z e espaço. Se o usuário não obedecer a 
entrada de dados, peça para digitar novamente
A mesa coisa para a idade, que deve ter apenas 
valores numericos
A mesma coisa para cpf que deve aceitar valores 
numeros sem espaço, traço ou ponto
No caso do salario eleve deve aceitar apenas 
números e virgula


Ao final imprima na tela o nome, a idade 
adicionado + 10 e o cpf representado na forma 
xxx.xxx.xxx-xx e imprima o salario 
adicionado + 100 
*/
public class Prog4 {
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);

        //VALIDAR NOME
        String nome;
        boolean flag = true;
        do{
            System.out.print("Nome: ");
            nome = dd.nextLine();
            char x[] = nome.toLowerCase().toCharArray();
            int i;
            for(i=0; i < x.length; i++){
                //he cl
                if((x[i] < 'a' || x[i] > 'z') &&  x[i] != ' '){
                    System.out.println("Informe apenas caracteres válidos");
                    break;
                }
            }
            if (i == x.length)
                flag = false;

        }while(flag);

        //VALIDADE IDADE
        flag = true;
        String id=null;
        while(flag){ //for(;flag;)
            System.out.print("Digite sua idade: ");
            id = dd.next();
            char x[] = id.toCharArray();
            int i;
            for(i=0; i < x.length; i++){
                if(x[i] < '0' || x[i] > '9' ){
                    System.out.println("Digite apenas caracteres numericos");
                    break;
                }
            }
            if(i == x.length)
                flag = false;
        }

         //VALIDADE DE CPF
         flag = true;
         String cpf=null;
         for(;flag;){ //for(;flag;)
             System.out.print("Digite cpf: ");
             cpf = dd.next();
             if(cpf.length() != 11){
                System.out.println("CPF inválido");
                continue;
             }
             char x[] = cpf.toCharArray();
             int i;
             for(i=0; i < x.length; i++){
                 if(x[i] < '0' || x[i] > '9' ){
                     System.out.println("Digite apenas caracteres numericos");
                     break;
                 }
             }
             if(i == x.length)
                 flag = false;
         }
        System.out.println("Nome: "+nome);
        //Convertendo String para número
        int idade = Integer.parseInt(id);
        idade +=10;
        System.out.println("Idade: "+idade);
        System.out.print("CPF: ");
        for(int i=0; i < cpf.length(); i++){
            System.out.print(cpf.charAt(i));
            if(i !=0 && (i+1) % 3 == 0 && i !=8)
                System.out.print(".");
            if(i==8)
                System.out.print("-");
        }
        System.out.println();


    }    
}
