import java.util.Scanner;

public class HelloWorld{
	public static void main(String[] args){
    System.out.println("Antecessor e Sucessor de um numero");
		Scanner s = new Scanner(System.in);


		System.out.println("Insert an integer");
		int valor = s.nextInt();

		valor = --valor;
		System.out.println("O antecessor eh "+ valor);
		valor = valor+2;
		System.out.println("O sucessor eh " + valor);




	}
}
