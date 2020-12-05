package lista02;
import java.util.Scanner;
public class PaiFilho {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		int numero, antecessor, sucessor;
		System.out.println("bem vindo!, esse porgrama apresenta o antecessor e o sucessor de um número escolhido");
		System.out.println("digite um número");
		numero = in.nextInt();
		antecessor = numero-1;
		sucessor = numero+1;
		System.out.println("o antecessor de "+numero+" é "+antecessor+ " e o sucessor é "+sucessor);
		in.close();
	}

}
