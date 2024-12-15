import java.util.Scanner;

public class Casa {
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);
       
        System.out.print("Digite uma palavra de 4 caracteres: ");
        String palavra = dd.nextLine();
       
        if (palavra.length() != 4) {
            System.out.println("A palavra deve ter exatamente 4 caracteres.");
        } else {
            StringBuilder vogais = new StringBuilder();
            StringBuilder consoantes = new StringBuilder();

            for (int i = 0; i < palavra.length(); i++) {
                char c = palavra.charAt(i);
                if (isVogal(c)) {
                    vogais.append(c);
                } else {
                    consoantes.append(c);
                }
            }
           
            String novaPalavra = vogais.toString() + consoantes.toString();
            System.out.println("Nova palavra: " + novaPalavra);
        }

    }

    public static boolean isVogal(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
