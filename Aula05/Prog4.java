import javax.sound.sampled.SourceDataLine;

/*
Diferença ente ++ antes ou após o nome da variável 
*/
public class Prog4 {
    public static void main(String[] args) {
        int x =4;
        System.out.println("Valor x = "+x);
        int y = ++x;
        System.out.println("x = "+x +" e y = "+y);
        int z = x++;    
        System.out.println("x = "+x +" e z = "+z);
    
    }

}
