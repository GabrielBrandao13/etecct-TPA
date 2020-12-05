package prjDia17;
import java.util.Scanner;
public class Imc {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Bem vindo!, esse programa calcula e dá informações sobre seu IMC.");
		System.out.println("Para começar, informe seu peso...");
		Double peso = in.nextDouble();
		System.out.println("Agora informe sua altura(em metros)");
		Double altura = in.nextDouble();
		Double imc = peso/(altura*altura);
		System.out.println("Seu IMC é de: "+imc);
		in.close();
		if(imc<18.5) {
			System.out.println("Excesso de magreza");
		}else if(imc>18.5 && imc <25) {
			System.out.println("Peso normal");
		}else if(imc>25 && imc<30) {
			System.out.println("Acima do peso...");
		}else if(imc>30 && imc<35) {
			System.out.println("Obesidade de primeiro grau...");
		}else if(imc>35 && imc<40) {
			System.out.println("Obesidade de segundo grau!");
		}else if(imc>40) {
			System.out.println("obesidade de terceiro grau!!!");
		}
	}
}
