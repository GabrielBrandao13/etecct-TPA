package lista02;
import java.util.Scanner;
public class ValorIPVA {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		double preco, ipva;
		System.out.println("esse programa calcula a taxa de IPVA de um autom�vel");
		System.out.println("digite o pre�o do carro");
		preco = in.nextDouble();
		ipva = preco/100*4;
		System.out.println("a taxa de IPVA � de "+ ipva);
		in.close();
	}

}
