package prjPag36;
import java.util.Scanner;
public class SalarioMinimo {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um número para que ei diga se está acima ou abaixo do salário mínimo");
		Double salario = in.nextDouble();
		if(salario<954) {
			System.out.println("Esse salário é menor que o salário mínimo");
		}else if(salario> 954) {
			System.out.println("Esse salário é maior que o salário mínimo");
		}else if(salario == 954) {
			System.out.println("Esse salário é igual ao salário mínimo");
		}
		in.close();
	}
}
