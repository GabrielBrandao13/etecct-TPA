package prjPag36;
import java.util.Scanner;
public class SalarioMinimo {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um n�mero para que ei diga se est� acima ou abaixo do sal�rio m�nimo");
		Double salario = in.nextDouble();
		if(salario<954) {
			System.out.println("Esse sal�rio � menor que o sal�rio m�nimo");
		}else if(salario> 954) {
			System.out.println("Esse sal�rio � maior que o sal�rio m�nimo");
		}else if(salario == 954) {
			System.out.println("Esse sal�rio � igual ao sal�rio m�nimo");
		}
		in.close();
	}
}
