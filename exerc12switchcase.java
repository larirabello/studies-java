import java.util.Scanner;
public class exerc12switchcase {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String x;
    float n1, n2, oper=0;

    System.out.println("Insira um simbolo: ");
    x = s.next();

    System.out.println("Insira um numero: ");
    n1 = s.nextFloat();

    System.out.println("Insira outro numero: ");
    n2 = s.nextFloat();

   switch (x) {
        case "+":
            oper=n1+n2;
            System.out.println("A soma eh: "+oper);
            break;
        case "-":
            oper=n1-n2;
            System.out.println("A subtracao eh: "+oper);
            break;
        case "*":
             oper=n1*n2;
             System.out.println("A multiplicacao eh: "+oper);
             break;
        case "/":
            oper=n1/n2;
            System.out.println("A divisao eh: "+oper);
            break;

        }

  }

}
