package prjPag43;
import java.util.Scanner;
public class DescontoINSS {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		int i = 0;
		double desconto = 0;
		double percentualDesconto = 0;
		do {
			System.out.println("Digite seu salário");
			double salario = in.nextDouble();
			if(salario<2000) {
				percentualDesconto = 8.5/100;
			}else if(salario>=2000){
				percentualDesconto = 11;
			}
			desconto = (salario*percentualDesconto)/100;
			System.out.println("O desconto será de "+desconto+" reais");
			i++;
		}while(i<4);
		System.out.println("Fim do programa");
		in.close();
	}
}
