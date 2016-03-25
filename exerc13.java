import java.util.Scanner;
public class exerc13 {
  public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  float horas=0, valor=0, sal=0;

  System.out.println("Insira a quantidade de horas: ");
  horas = s.nextFloat();
  System.out.println("Insira o valor correspondente a hora: ");
  valor = s.nextFloat();

  if (horas<40) {
    sal = horas*valor;
    System.out.println("O salario mensal eh de "+sal);
  } else if (horas>60) {
    sal = (horas*valor)*2;
    System.out.println("O salario mensal eh de "+sal);
  } else {
    sal = (horas*valor)*1.5f;
    System.out.println("O salario mensal eh de "+sal);
  }
  }
}
