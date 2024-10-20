//Exemplo de como imprimir valores fracionádos
public class Prog6 {
  public static void main(String[] args) {
    //Imprimindo o quociente da divisao de 10/3
    System.out.println("Println: 10/3 = "+(10.0/3));
    System.out.print("Print: 10/3 = "+(10.0/3)+"\n");
    System.out.printf("Printf: 10/3 = %f\n",10.0/3);

    //precisao de uma casa decimal
    System.out.printf("Printf: 10/3 = %.1f\n",10.0/3);
  }  
}
