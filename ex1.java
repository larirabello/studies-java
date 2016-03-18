import java.util.Scanner;

public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Quadrados");
    Scanner s = new Scanner(System.in);
    int n1=0, quad=0;

    System.out.println("Digite o parametro do intervalo: ");
    n1 = s.nextInt();


    for (int i=0; i<=n1; i++) {
      quad=i*i;
      System.out.println(quad);
    }

  }
}
