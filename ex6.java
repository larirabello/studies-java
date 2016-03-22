/* Dados o número n de alunos de uma turma de Introdução aos Autômatos a Pilha (MAC 414) e suas notas da primeira prova, determinar a maior e a menor nota obtidas por essa turma (Nota máxima = 100 e nota mínima = 0). */
import java.util.Scanner;
public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Max e Min");
    Scanner s = new Scanner(System.in);
    int n, a=0, i=0, min=100, max=0;

     System.out.println("Digite a quantidade de alunos: ");
      a = s.nextInt();

    while (i < a) {
      System.out.println("Digite a nota da prova: ");
      n = s.nextInt();

      if (n > max) {
        max=n;
      }
      if (n < min) {
        min=n;
      }

      i++;
    }

    System.out.println("Min: " + min);
    System.out.println("Max: " + max);

  }
}
