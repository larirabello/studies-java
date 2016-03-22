/* Dado um número inteiro positivo n, calcular a soma dos n primeiros números inteiros positivos. */

import java.util.Scanner;

public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Soma");
    Scanner s = new Scanner(System.in);
    int n=0, soma=0;

    System.out.println("Digite um numero: ");
    n = s.nextInt();

    for (int i=0; i<=n; i++) {
      soma += i;
    }
    System.out.println("A soma eh: "+soma);
  }
}
