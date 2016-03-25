import java.util.Scanner;
public class exerc11 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    float v1, v2, v3, maior, menor, media = 0;

    System.out.println("Digite o primeiro numero: ");
    v1 = s.nextFloat();

    System.out.println("Digite o segundo numero: ");
    v2 = s.nextFloat();

    System.out.println("Digite o terceiro numero: ");
    v3 = s.nextFloat();

    if (v1>v2) {
      maior = v1;
      menor = v2;
    } else {
      maior = v2;
      menor = v1;
    }

    if (v3>maior) {
      System.out.println("\n O maior eh: "+v3);
    } else {
      System.out.println("O maior numero eh: "+maior);
    }

    if(v3<menor) {
      System.out.println("O menor eh: "+v3);
    } else {
      System.out.println("O menor eh: "+menor);
    }


    media = (v1+v2+v3)/3;
    System.out.println("\n A media dos valores inseridos eh de: "+media);


  }

}
