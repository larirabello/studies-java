import java.util.Scanner;
public class HelloWorld{
	public static void main(String[] args){
    System.out.println("Idades");
		Scanner s = new Scanner(System.in);
    int idade=0, j=0, i=0, soma=0;

    soma+=idade;
    while (soma<=99) {
      System.out.println("Insira a idade: ");
		  idade = s.nextInt();

		  if (idade<21) {
        j++;
      }
      if (idade>50) {
        i++;
      }
    }

    System.out.println("Pessoas menores de 21 anos: "+j);
    System.out.println("Pessoas com mais de 50 anos: "+i);
	}
}
