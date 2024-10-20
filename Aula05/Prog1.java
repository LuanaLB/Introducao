/*
Exemplo de uso dos operadores básicos 
matemáticos (+, -, *, /) 
*/
public class Prog1 {
    public static void main(String[] args) {
        int x=5, y=3;
        double z = 5.1, t=3.2;
        System.out.println("Somar inteiros: "+ 
        "x + y = "+(x+y));
        System.out.println("Somar fracionários: "+ 
        "z + t = "+(z+t));
        System.out.println("Somar int + double: "+ 
        "x + z = "+(x+z));

        //Fazer a subtração
        System.out.println("Subtrair inteiros: "+ 
        "x - y = "+(x-y));
        System.out.println("Subtrair fracionários: "+ 
        "z - t = "+(z-t));
        System.out.println("Subtrair int - double: "+ 
        "x - z = "+(x-z));

        //Fazer a multiplicação
        System.out.println("Multiplicar inteiros: "+ 
        "x * y = "+(x*y));
        System.out.println("Multiplicar fracionários: "+ 
        "z * t = "+(z*t));
        System.out.println("Multiplicar int * double: "+ 
        "x * z = "+(x*z));

        //Fazer a divisão
        System.out.println("Dividir inteiros: "+ 
        "x / y = "+(x/y));
        System.out.println("Dividir fracionários: "+ 
        "z / t = "+(z/t));
        System.out.println("Dividir int com double: "+ 
        "x / z = "+(x/z));
    }
}
