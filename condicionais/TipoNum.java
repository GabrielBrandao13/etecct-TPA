package prjPag36;
import java.util.Scanner;
public class TipoNum {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Diga um n�mero inteiro sendo negativo ou positivo");
		int n = in.nextInt();
		if(n>0) {
					System.out.println("esse n�mero � positivo");
		}else if(n<0) {
					System.out.println("esse n�mero � negativo");
		}else if(n ==0) {
					System.out.println("esse n�mero � n�utro(zero)");
		}else {
					System.out.println("esse n�mero n�o � nem positivo, nem negativo, nem n�utro");
		}
		in.close();
	}
}
