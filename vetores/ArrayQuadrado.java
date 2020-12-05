import java.util.Scanner;
public class ArrayQuadrado {
	public static void main(String[]args) {
		int[]a = new int[10];
		int[]b = new int[10];
		Scanner in = new Scanner(System.in);
		
		for(int i=0; i<a.length;i++) {
			System.out.println("Digite o "+(i+1)+" valor que deseja colocar no array");
			a[i] = in.nextInt();
			b[i] = a[i]*a[i];
		}
		System.out.println("O primeiro array tem os valores:");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("E o segundo array tem os valores:");
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
	}
	
}
