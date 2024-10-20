/*
Exemplo de como obter o quociente da divisão
e como obter o resto da divisao 
*/
public class Prog2 {
    

    public static void main(String[] args) {
        int x = 10, y=3;
        int quociente = x/y;
        int resto = x%y;
        System.out.printf("Quociente de: "+
        "%d / %d = %d\n",x,y,quociente);

        System.out.printf("Resto de: "+
        "%d / %d = %d\n",x,y,resto);
    }
}
