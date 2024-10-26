import java.util.Scanner;

import javax.lang.model.util.SimpleAnnotationValueVisitor7;

/*
ATIVIDADE 1: Faça um programa que determine
quantos dígitos tem um inteiro positivo a ser
  digitado por um usuário. 
Obs1. Essa solução tem que ser feita
 exclusivamente utilizando if-else.
Obs2. O número deverá ter no máximo 10 digitos 
*/

public class Prog1{
    
    public static void main(String[] args) {
        int num=0, nDigitos;

        Scanner dd = new Scanner(System.in);

        System.out.print("Digite um número: ");
        num = dd.nextInt(); //100000

        if(num < 0){
            System.out.println("Informe apenas números positivos");
        }else{
            if(num > 1000000000) //10 digitos
                System.out.println(num + " tem 10 dígitos ou mais.");
            else{
                if (num >= 100000000){ //9 digitos
                    System.out.println(num + " tem 9 dígitos.");
            
                }else{
                    if (num >= 10000000){ //8 digitos
                        System.out.println(num + " tem 8 dígitos.");
                
                    }else{
                        if (num >= 1000000){ //7 digitos
                            System.out.println(num + " tem 7 dígitos.");
                    
                        }else{
                            if (num >= 100000){ //6 digitos
                                System.out.println(num + " tem 6 dígitos.");
                            }else{
                                if (num >= 10000){ //5 digitos
                                    System.out.println(num + " tem 5 dígitos.");
                                }else{
                                    if (num >= 1000){ //4 digitos
                                        System.out.println(num + " tem 4 dígitos.");
                                    }else{
                                        if (num >= 100){ //3 digitos
                                            System.out.println(num + " tem 3 dígitos.");
                                        }else{
                                            if (num >= 10){ //2 digitos
                                                System.out.println(num + " tem 2 dígitos.");
                                            }else{
                                                System.out.println(num + " tem 1 dígito.");
                                            }
                                        }
                                    }
                                }
                            }    
                        }
                    }
                }
            }    
        }
    }
}