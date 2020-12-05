package prjLista0910;

public class NumerosPrimos {
	public static void main(String[]args) {
		//laço que irá se repetir 200 vezes
		for(int a = 1; a<=200; a++) {
			int multiplos = 0;
			//conta o número de divisores que "a" tem
			for(int b = 1; b<=a; b++) {
				if(a%b == 0) {
					multiplos +=1;
				}
			}
			if(multiplos == 2) {
				System.out.println(a);
			}
		}
	}
}
