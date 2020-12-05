package prjPag36;
import java.util.Scanner;
public class TipoNum {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Diga um número inteiro sendo negativo ou positivo");
		int n = in.nextInt();
		if(n>0) {
					System.out.println("esse número é positivo");
		}else if(n<0) {
					System.out.println("esse número é negativo");
		}else if(n ==0) {
					System.out.println("esse número é nêutro(zero)");
		}else {
					System.out.println("esse número não é nem positivo, nem negativo, nem nêutro");
		}
		in.close();
	}
}
