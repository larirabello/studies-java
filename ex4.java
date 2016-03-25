/*  Dados um inteiro x e um inteiro não-negativo n, calcular x n.  */
import java.util.Scanner;

public class ex4 {
  public static void main(String[] args) {
    System.out.println("Potenciacao");

    Scanner s = new Scanner(System.in);
    int x=0, n=0, p=0;

    System.out.println("Digite a base: ");
    x = s.nextInt();
    System.out.println("Digite o expoente: ");
    n = s.nextInt();

    p = (int) Math.pow (x, n);

    System.out.println("O resultado e': "+p);

  }
}
