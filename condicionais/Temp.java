package prjPag36;
import java.util.Scanner;
public class Temp {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.println("digite a temperatura em Fahrenheight para que seja convertida em Celsius");
		Double tempf = in.nextDouble();
		Double tempc = (tempf - 32)* 5/9;
		System.out.println("A temperatura de "+ tempf+" Fahrenheight equivale a:"+ tempc+" graus Celsius");
		if(tempc<15) {
			System.out.println("Está frio");
		}else if(tempc >= 15 & tempc<22) {
			System.out.println("Está ameno");
		}else if(tempc >= 22) {
			System.out.println("Está calor");
		}
		in.close();
	}
}
