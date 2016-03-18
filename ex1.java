import java.util.Scanner;

public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Quadrados");
    Scanner s = new Scanner(System.in);
    int n=0, quad=0;

    System.out.println("Digite o parametro do intervalo: ");
    n = s.nextInt();


    while (n != 0) {
      quad = n*n;
      System.out.println("O quadrado do valor eh: "+quad)
    }

  }
}


//weird
