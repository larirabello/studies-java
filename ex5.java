/* Uma loja de discos anota diariamente durante o mês de março a quantidade de discos vendidos. Determinar em que dia desse mês ocorreu a maior venda e qual foi a quantidade de discos vendida nesse dia.  */
import java.util.Scanner;
public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Venda de discos");
    Scanner s = new Scanner(System.in);
    int q=0, i=0, max=0, d=0;

    while (i < 31) {
      System.out.println("Digite a quantidade de vendas do dia: ");
      q = s.nextInt();

      if (q > max) {
        max = q;
        d = i+1;
      }

      i++;
    }

    System.out.println("O dia com maior quantidade de vendas foi: " +d+" de marco.");

  }
}
