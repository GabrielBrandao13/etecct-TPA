package lista02;
import java.util.Scanner;
public class DescontoProduto {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		double preco, desconto, precoFinal;
		System.out.println("olá, esse programa calcula o preço de um objeto com desconto");
		System.out.println("diga-me o preço do produto");
		preco = in.nextDouble();
		System.out.println("diga-me a taxa de desconto em porcentagem");
		desconto = in.nextDouble();
		desconto = preco*desconto/100;
		precoFinal = preco-desconto;
		System.out.println("com esse desconto o preço final do produto será de "+precoFinal);
		in.close();
		
	}
}
