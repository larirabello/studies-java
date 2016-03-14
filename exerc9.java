import java.util.Scanner;
public class HelloWorld {
  public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
   float valor = 0;


     System.out.println("Digite o valor em Dolar: ");
     valor = s.nextFloat();

     valor = valor*2.3f;
     System.out.println("O valor em Reais: R$"+valor);
  }
}
