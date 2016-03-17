import java.util.Scanner;
public class HelloWorld {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    float fo=0, ac=0;

    System.out.println("Insira a aceleracao em m/s: ");
    ac = s.nextFloat();

    fo = 700*ac;

    System.out.println("A forca exercida eh de: "+fo+" N.");
  }
}
