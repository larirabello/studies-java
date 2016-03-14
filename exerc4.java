import java.util.Scanner;
public class HelloWorld {
  public static void main(String[] args) {
    String nome;
    int letra=0;
    Scanner s = new Scanner(System.in);

    System.out.println("Insira seu nome: ");
    nome = s.next();

    for (int i=0; i<nome.length();i++) {
      if (nome.charAt(i) =='a' || nome.charAt(i) == 'A') {
        letra++;
      }
    }
    System.out.println("Seu nome tem "+letra+ " As");
  }
}
