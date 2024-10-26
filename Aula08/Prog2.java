import java.util.Scanner;

/*
ATIVIDADE2: Faça um programa que realize a 
decomposiçao de um número positivo de até três
dígitos a ser digitado por um usuário. 
Se o número for superior a 3 dígitos ou 
negativo o programa deverá ser encerrado.
Obs. Use exclusivamente if-else

Ex: valor 312

Resposta: 312 == 300 + 10 +2  
*/
//FORMA COMPLICADA DE FAZER
public class Prog2 {
    public static void main(String[] args) {
        int vDig, vOrig, unid=0, dez=0, cent=0;
        Scanner dd = new Scanner(System.in);

        System.out.print("Número (<= 3 dígitos): ");
        vDig = dd.nextInt();
        vOrig = vDig;

        if(vDig >=1000){
            System.out.println("Informe número de até 3 dígitos");
            return; //encerra o método
        }

        //Descobrindo a centena
        if(vDig >=900){
            cent = 900;
            vDig -=cent; //vDig = vDig - cent
        }else{
            if(vDig >=800){
                cent = 800;
                vDig -=cent;
            }else{
                if(vDig >=700){
                    cent = 700;
                    vDig -=cent;
                }else{
                    if(vDig >=600){
                        cent = 600;
                        vDig -=cent;
                    }else{
                        if(vDig >=500){
                            cent = 500;
                            vDig -=cent;
                        }else{
                            if(vDig >=400){
                                cent = 400;
                                vDig -=cent;
                            }else{
                                if(vDig >=300){
                                    cent = 300;
                                    vDig -=cent;
                                }else{
                                    if(vDig >=200){
                                        cent = 200;
                                        vDig -=cent;
                                    }else{
                                        if(vDig >=100){
                                            cent = 100;
                                            vDig -=cent;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        //Descobrindo as dezenas
        if(vDig > 90){
            dez = 90;
            vDig -=90; //vDig = vDig -90
        }else{
            if(vDig > 80){
                dez = 80;
                vDig -=80; //vDig = vDig -90
            }else{
                if(vDig > 70){
                    dez = 70;
                    vDig -=70; //vDig = vDig -90
                }else{
                    if(vDig > 60){
                        dez = 60;
                        vDig -=60; //vDig = vDig -90
                    }else{
                        if(vDig > 50){
                            dez = 50;
                            vDig -=50; //vDig = vDig -90
                        }else{
                            if(vDig > 40){
                                dez = 40;
                                vDig -=40; //vDig = vDig -90
                            }else{
                                if(vDig > 30){
                                    dez = 30;
                                    vDig -=30; //vDig = vDig -90
                                }else{
                                    if(vDig > 20){
                                        dez = 20;
                                        vDig -=20; //vDig = vDig -90
                                    }else{
                                        if(vDig > 10){
                                            dez = 10;
                                            vDig -=10; //vDig = vDig -90
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } 
        }
        unid = vDig;
        System.out.println(vOrig + " = "+cent + " + "+dez+" + "+unid );
    }    
}
