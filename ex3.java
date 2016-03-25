/* Dado um número inteiro positivo n, imprimir os n primeiros naturais ímpares. */

import java.util.Scanner;

public class ex3 {
  public static void main(String[] args) {
    System.out.println("Impar");
    Scanner s = new Scanner(System.in);
    int n=0;

    System.out.println("Digite um numero: ");
    n = s.nextInt();

    for (int i=0; i<=n; i++) {
      if (i%2!=0) {
        System.out.println("E' impar: "+i);
      }
    }

  }
}
