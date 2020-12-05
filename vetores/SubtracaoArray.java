import java.util.Scanner;
public class SubtracaoArray {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		int a[] = new int[10];
		int b[] = new int[10];
		int c[] = new int[10];
		
		for(int i=0;i<a.length;i++) {
			System.out.println("Digite um número que deseja adicionar no primeiro array");
			a[i] = in.nextInt();
			System.out.println("Digite um número que deseja adicionar no segundo array");
			b[i] = in.nextInt();
			c[i] = a[i] - b[i];
		}
		for(int i=0;i<c.length;i++) {
			System.out.println(a[i]+"-"+b[i]+"="+c[i]);
		}
		in.close();
	}
}
