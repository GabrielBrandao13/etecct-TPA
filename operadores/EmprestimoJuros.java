package lista02;
import java.util.Scanner;
public class EmprestimoJuros {
	public static void main(String[]args) {
		Double emprestimo, juros, valor, valorParcela;
		int meses;
		Scanner in = new Scanner(System.in);
		System.out.println("esse programa calcula o valor de juros e parcelas de um empréstimo");
		System.out.println("diga-me o quanto pegou emprestado");
		emprestimo = in.nextDouble();
		System.out.println("diga-me em quantos meses vai pagar isso");
		meses = in.nextInt();
		juros = emprestimo/40*meses;
		valor = emprestimo+juros;
		valorParcela = valor/meses;
		System.out.println("cada parcela vale "+valorParcela);
		System.out.println("no final você pagará "+valor);
		in.close();
	}

}
