package prjNumeros;
import java.util.Scanner;
public class Numeros {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		int n;
		System.out.println("diga um n�mero");
		n = in.nextInt();
		if(n>20) {
			System.out.println("esse n�mero � maior que 20!");
		}else {
			System.out.println("esse n�mero n�o � maior que 20!");
		}
		if(n%2 == 0) {
			System.out.println("esse n�mero � par");
		}else if(n%2 != 0) {
			System.out.println("esse n�mero � impar");
		}else {
			System.out.println("dificil dizer se esse n�mero � inpar ou par :/");
		}
		if(n<0) {
			System.out.println("esse n�mero � negativo");
		}else if(n>0) {
			System.out.println("esse n�mero � positivo");
		}else if(n == 0){
			System.out.println("esse � o n�mero 0");
		}
	}
}
