import java.util.Scanner;
public class exerc7 {
  public static void main(String[] args) {
    System.out.println("Calculo horario");
    Scanner s = new Scanner(System.in);
    int sec=0, m=0, h=0;

    System.out.println("Insira os segundos: ");
    sec = s.nextInt();

    m = sec/60;
    sec = sec%60;

    h = m/60;
    m = m%60;

    System.out.println(h+" hora "+m+" minutos e "+sec+" segundos");

  }
}
