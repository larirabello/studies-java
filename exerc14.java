import java.util.Scanner;

public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Poligonos");
    Scanner s = new Scanner(System.in);
    int l = 0;
    double t = 0, a = 0;

    System.out.println("Insira o numero de lados: ");
    l = s.nextInt();

    System.out.println("Insira o tamanho dos lados: ");
    t = s.nextFloat();

    switch (l) {

      case 3:
        a = l*l*1.73/4;
        System.out.println("A area do triangulo eh de: "+a);
        break;

       case 4:
        a = l*l;
        System.out.println("A area do quadrado eh de: "+a);
        break;

       case 6:
        a = 6*l*l*1.73/4;
        System.out.println("A area do hexagono eh de: "+a);
        break;

        default:
        System.out.println("Nao sei calcular a area");
        break;

    }
  }
}
