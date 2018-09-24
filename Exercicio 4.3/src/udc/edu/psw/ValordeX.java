package udc.edu.psw;
import java.util.Scanner;

public class ValordeX {
	
	private static int x;
	static Scanner scan = new Scanner(System.in);
	

	public static void Entrada() {
		
		
		System.out.println("\nEntre com o valor de X");
		x = scan.nextInt();
		
	}
	
	public static void Calculos() {
		

			if (x % 2 == 0) {
				x = x / 2;
				System.out.println("Valor de X:");
				System.out.print(x);
			}
			else {
				x = 2 * x / 3 + 1;
				System.out.println("Valor de X:");
				System.out.print(x);
			}

	}
	
	public static void main(String[] args) {
		
		Entrada();
		Calculos();
		
	}
}
