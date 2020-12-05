package lista02;
import java.util.Scanner;
public class ValorIPVA {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		double preco, ipva;
		System.out.println("esse programa calcula a taxa de IPVA de um automóvel");
		System.out.println("digite o preço do carro");
		preco = in.nextDouble();
		ipva = preco/100*4;
		System.out.println("a taxa de IPVA é de "+ ipva);
		in.close();
	}

}
