import java.util.Scanner;
public class ArrayNumerosPrimos {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		int a[] = new int[10];
		
		for(int i=0;i<a.length;i++) {
			System.out.println("Digite um número inteiro que deseja adicionar ao array");
			a[i] = in.nextInt();
		}
		System.out.println("Os números primos encontrados no array foram os seguintes:");
		int totalPrimos = 0;
		for(int i=0;i<a.length;i++) {
			int divisores = 0;
			for(int d=1;d<=a[i];d++) {
				if(a[i]%d == 0) {
					divisores +=1;
				}
			}
			if(divisores == 2) {
				System.out.println(a[i]);
				totalPrimos+=1;
			}
		}
		System.out.println("O número total de números primos encontrados no array foi de "+totalPrimos);
		in.close();
	}
}
