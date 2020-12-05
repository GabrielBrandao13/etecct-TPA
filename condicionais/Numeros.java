package prjNumeros;
import java.util.Scanner;
public class Numeros {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		int n;
		System.out.println("diga um número");
		n = in.nextInt();
		if(n>20) {
			System.out.println("esse número é maior que 20!");
		}else {
			System.out.println("esse número não é maior que 20!");
		}
		if(n%2 == 0) {
			System.out.println("esse número é par");
		}else if(n%2 != 0) {
			System.out.println("esse número é impar");
		}else {
			System.out.println("dificil dizer se esse número é inpar ou par :/");
		}
		if(n<0) {
			System.out.println("esse número é negativo");
		}else if(n>0) {
			System.out.println("esse número é positivo");
		}else if(n == 0){
			System.out.println("esse é o número 0");
		}
	}
}
