import java.util.Scanner;

public class exerc1 {
	public static void main(String[] args){
    System.out.println("Antecessor e Sucessor de um numero");
		Scanner s = new Scanner(System.in);


		System.out.println("Insert an integer");
		int valor = s.nextInt();


		System.out.println("O antecessor eh "+(valor-1));

		System.out.println("O sucessor eh "+(valor+1));

	}
}
