import java.util.Scanner;
public class HelloWorld {
  public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
   int n1;
   int n2;
   int temp = 0;

    System.out.println("Digite o n1: ");
    n1 = s.nextInt();

    System.out.println("Digite o n2: ");
    n2 = s.nextInt();

    temp = n2;
    n2 = n1;
    n1= temp;

    System.out.println ("N1: "+n1+" N2: "+n2);
  }
}
