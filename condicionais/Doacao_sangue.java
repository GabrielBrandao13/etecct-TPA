package prj24_07;
import java.util.Scanner;
public class Doacao_sangue {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Bem vindo! esse programa informa se voc� pode doar sangue baseado na sua idade");
		System.out.println("Para come�ar, digite sua idade:");
		int idade = in.nextInt();
		if(idade>17 && idade<68) {
			System.out.println("Voc� j� pode doar sangue.");
		}else {
			System.out.println("Voc� n�o pode doar sangue.");
		}
		in.close();
	}
}
