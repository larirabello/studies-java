/* Dado um inteiro não-negativo n, determinar n! */

import java.util.Scanner;

public class HelloWorld {
public static void main(String[] args) {
  System.out.println ("Fatorial");
  Scanner s = new Scanner (System.in);
  int n=0, i=2, fat=1;

    System.out.println("Insira um numero nao-negativo: ");
    n = s.nextInt();

    while (i<=n) {
      fat = fat*i;
      i++;
    }

   System.out.println("O fatorial de "+n+" e' igual a "+fat+".");

  }
}
