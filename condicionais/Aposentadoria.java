package prjDia17;
import java.util.Scanner;
public class Aposentadoria {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Bem vindo!, esse programa diz se voc� pode se aposentar baseado no seu g�nero e idade");
		System.out.println("Digite o ano em que estamos");
		int ano = in.nextInt();
		System.out.println("Digite o seu ano de nascimento");
		int nascimento = in.nextInt();
		int idade = ano - nascimento;
		System.out.println("Digite seu g�nero, 'm' para homem, 'f' para mulher");
		String sexo = in.next();
		if(sexo.equals("m")) {
			if(idade>64) {
				System.out.println("O senhor j� pode se aposentar");
			}else {
				System.out.println("Infelizmente, um homem com essa idade ainda n�o pode se aposentar...");
			}
		}else if(sexo.equals("f")) {
			if(idade>59) {
				System.out.println("A senhora j� pode se aposentar");
			}else {
				System.out.println("Infelizmente uma mulher com essa idade ainda n�o pode se aposentar");
			}
		}else {
			System.out.println("Confirme se n�o digitou errado, s� reconhecemos 'm' para homens e 'f' para mulheres ");
		}
		in.close();
	}
}
