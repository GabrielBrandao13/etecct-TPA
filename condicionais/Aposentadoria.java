package prjDia17;
import java.util.Scanner;
public class Aposentadoria {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Bem vindo!, esse programa diz se você pode se aposentar baseado no seu gênero e idade");
		System.out.println("Digite o ano em que estamos");
		int ano = in.nextInt();
		System.out.println("Digite o seu ano de nascimento");
		int nascimento = in.nextInt();
		int idade = ano - nascimento;
		System.out.println("Digite seu gênero, 'm' para homem, 'f' para mulher");
		String sexo = in.next();
		if(sexo.equals("m")) {
			if(idade>64) {
				System.out.println("O senhor já pode se aposentar");
			}else {
				System.out.println("Infelizmente, um homem com essa idade ainda não pode se aposentar...");
			}
		}else if(sexo.equals("f")) {
			if(idade>59) {
				System.out.println("A senhora já pode se aposentar");
			}else {
				System.out.println("Infelizmente uma mulher com essa idade ainda não pode se aposentar");
			}
		}else {
			System.out.println("Confirme se não digitou errado, só reconhecemos 'm' para homens e 'f' para mulheres ");
		}
		in.close();
	}
}
