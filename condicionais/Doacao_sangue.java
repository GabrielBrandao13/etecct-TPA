package prj24_07;
import java.util.Scanner;
public class Doacao_sangue {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Bem vindo! esse programa informa se você pode doar sangue baseado na sua idade");
		System.out.println("Para começar, digite sua idade:");
		int idade = in.nextInt();
		if(idade>17 && idade<68) {
			System.out.println("Você já pode doar sangue.");
		}else {
			System.out.println("Você não pode doar sangue.");
		}
		in.close();
	}
}
