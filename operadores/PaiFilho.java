package lista02;
import java.util.Scanner;
public class PaiFilho {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		int numero, antecessor, sucessor;
		System.out.println("bem vindo!, esse porgrama apresenta o antecessor e o sucessor de um n�mero escolhido");
		System.out.println("digite um n�mero");
		numero = in.nextInt();
		antecessor = numero-1;
		sucessor = numero+1;
		System.out.println("o antecessor de "+numero+" � "+antecessor+ " e o sucessor � "+sucessor);
		in.close();
	}

}
