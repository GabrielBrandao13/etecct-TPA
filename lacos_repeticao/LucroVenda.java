package prjPag43;
import java.util.Scanner;
public class LucroVenda {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		String confirm = "none";
		System.out.println("Bem vindo, esse programa calcula o aumento do preço de um produto usando como base um percentual");
		do {
			System.out.println("Digite  o preço do produto");
			double preco = in.nextDouble();
			System.out.println("Digite o percentual de lucro que deseja ter com esse produto");
			double percentualLucro = in.nextDouble();
			double novoPreco = (preco*percentualLucro)/100+preco;
			System.out.println("Com essa taxa, o no opreço desse produto será de "+novoPreco+" Reais");
			System.out.println("Deseja continuar?(S)");
			confirm = in.next();
		}while(confirm.equalsIgnoreCase("S"));
		in.close();
	}
	
}
