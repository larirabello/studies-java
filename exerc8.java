import java.util.Scanner;
public class HelloWorld {
  public static void main(String[] args) {
   Scanner s = new Scanner(System.in);
   int valor;
   float media = 0;

   for (valor=0; valor<=3; valor++) {
     System.out.println("Digite o número: ");
     valor = s.nextInt();
   }


   media = valor;
   System.out.println(media);
  }
}
