/*
Exemplo do uso do incremente ou decremento 
unário 
++ ou -- 
*/
public class Prog3 {
    public static void main(String[] args) {
        int x=1;
        x = x + 1; //x =2
        x++; //x=3 => x = x+1
        ++x; //x=4; => x = x+1
        System.out.println("O valor de x = "+x);
    
        int y =10;
        y = y -1; //y=9
        y--; //y =8 => y = y -1
        --y; //y=7 => y = y -1
        System.out.println("O valor de y = "+y);
    }
}
