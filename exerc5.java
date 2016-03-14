import java.util.Scanner;
public class HelloWorld {
  public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
   int temp;

   System.out.println("Digite a temperatura em Celsius: ");
   temp = s.nextInt();

   temp = (9*temp+160)/5;
   System.out.println(temp);
  }
}
