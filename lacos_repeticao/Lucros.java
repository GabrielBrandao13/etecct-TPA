package prjLista0910;
import java.util.Scanner;
public class Lucros {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		String confirm = "N";
		do {
			System.out.println("Informe o custo que foi fazer esse produto");
			double custo = in.nextDouble();
			System.out.println("Informe qual o preço atribuido à ele");
			double preco = in.nextDouble();
			double lucro = preco-custo;
			
			System.out.println("O lucro foi de: "+lucro);
			System.out.println("Deseja continuar?(S)");
			confirm = in.next();
		}while(confirm.equalsIgnoreCase("S"));
		System.out.println("Fim do programa");
		in.close();
	}
}

