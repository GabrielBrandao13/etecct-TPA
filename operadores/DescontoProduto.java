package lista02;
import java.util.Scanner;
public class DescontoProduto {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		double preco, desconto, precoFinal;
		System.out.println("ol�, esse programa calcula o pre�o de um objeto com desconto");
		System.out.println("diga-me o pre�o do produto");
		preco = in.nextDouble();
		System.out.println("diga-me a taxa de desconto em porcentagem");
		desconto = in.nextDouble();
		desconto = preco*desconto/100;
		precoFinal = preco-desconto;
		System.out.println("com esse desconto o pre�o final do produto ser� de "+precoFinal);
		in.close();
		
	}
}
