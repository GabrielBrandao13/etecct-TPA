package lista02;
import java.util.Scanner;
public class somaQuadrado {
	public static void main(String[]args) {
		int n1, n2, n3, r;
		Scanner in = new Scanner(System.in);
		System.out.println("bem vindo!, esse programa apresenta a soma do quadrado entre tr�s n�meros");
		System.out.print("diga-me o primerio n�mero");
		n1 = in.nextInt();
		System.out.print("diga-me o segundo n�mero");
		n2 = in.nextInt();
		System.out.print("diga-me o terceiro n�mero");
		n3 = in.nextInt();
		n1 = n1*n1;
		n2 = n2*n2;
		n3 = n3*n3;
		r = n1+n2+n3;
		System.out.println("a soma do quadrado entre esses tr�s n�meros �: "+ r);
		in.close();
	}
}
