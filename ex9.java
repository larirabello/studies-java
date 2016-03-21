import java.util.Scanner;
public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Multiplos");
    Scanner s = new Scanner(System.in);
    int n=0, n1=0, n2=0, i=0, mult=0;

    System.out.println("Insira a quantidade de multiplos a ser mostrada: ");
    n = s.nextInt();

    while (n1<=0) {
      System.out.println("Insira o primeiro numero valido: ");
      n1 = s.nextInt();
    }

    while (n2<=0) {
      System.out.println("Insira o segundo numero valido: ");
      n2 = s.nextInt();
    }

    System.out.println("\n");

    while (i < n) {

      if (mult%n1==0 || mult%n2==0) {
      System.out.println(mult);
      i++;
    }
      mult++;
    }

  }
}
