import java.util.Scanner;
public class HelloWorld {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int valor, soma;

    System.out.println("Insira um valor: ");
    valor = s.nextInt();
    soma = valor+5;

    System.out.println("O numero + 5 eh igual a "+soma);
    System.out.println("O triplo desse numero eh igual a "+soma*3);


  }

}
