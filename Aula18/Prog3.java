/*
Crie um vetor inteiro de 3 posições já preenchidos
durante o processo de criação
Crie um segundo vetor do mesmo tipo e tamanho
e transfira os dados do primeiro vetor para o
segundo vetor 
*/
public class Prog3 {
    public static void main(String[] args) {
        int x[] = {10,20,30};
        int y[] = new int[3];

        //y = x; isso faz com que y aponte para o mesmo objeto de x 
        
        //fazendo a copia do vetor de x para o vetor y
        for (int i = 0; i < x.length; i++) {
            y[i] = x[i];
            
        }
        x[0] = 100;
        //Imprimindo o conteúdo do vetor y
        for (int i = 0; i < y.length; i++) {
            System.out.println(y[i]);
            
        }
    }
}
