import java.util.Scanner;
public class exerc3 {
  public static void main(String[] args) {
       float valor;
       System.out.println("Insira o valor do produto: ");
       Scanner s = new Scanner(System.in);
       valor = s.nextFloat();
       if (valor<20) {
         valor += valor*0.45f;
         System.out.println(valor);
       } else {
         valor += valor*0.3f;
         System.out.println(valor);
       }

  }
}
