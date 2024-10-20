//Uso de operadores aritméticos mais concisos
public class Prog5 {
    public static void main(String[] args) {
        int x = 10;
        int y = 3;
        
        x /=y; //x = x/y
        //x = x/y; //divida o valor de x por y e quociente vai para x
        System.out.println(x);
        x =10;
        x -=y; // => x = x -y
        System.out.println(x);
        x = 10;
        x %=y; // x = x % y;
        System.out.println(x);
        x = 10;
        x *=y; // x = x * y
        System.out.println(x);

    }
}
