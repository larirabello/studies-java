import java.util.Scanner;

public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Pares");
    Scanner s = new Scanner(System.in);
    int n=0, t=0;

    System.out.println("Digite um numero: ");
    n = s.nextInt();

    for (int i=0; i<=n; i++) {
      if (i%2==0) {
        System.out.println("E' par: "+i);
        t+=i;
      }

    }
     System.out.println("\nTOTAL: "+t);
  }
}
