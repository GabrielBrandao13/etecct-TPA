package lista02;
import java.util.Scanner;
public class ConversaoMetros {
	public static void main(String[]args) {
		double metros, quilometros;
		Scanner in = new Scanner(System.in);
		System.out.println("esse programa converte metros em quilômetros");
		System.out.println("diga-me o valor em metros que deseja converter em quilometros");
		metros = in.nextDouble();
		quilometros = metros/1000;
		System.out.println(metros+" metros equivalem a "+ quilometros+" quilômetros");
		in.close();
	}
}
