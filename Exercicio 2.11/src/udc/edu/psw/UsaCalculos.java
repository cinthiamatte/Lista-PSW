package udc.edu.psw;
import java.util.Scanner;

public class UsaCalculos{
	
	private static int valor1;
	private static int valor2;
	private static int valor3;
	private static Scanner scan;
	
	public static void main(String[] args)
	{
		@SuppressWarnings("unused")
		Calculos cal = new Calculos();
		scan = new Scanner(System.in);
		
		
		System.out.println("\nEntre com dois Valores para calculo de potencia");
		valor1 = scan.nextInt();
		valor2 = scan.nextInt();
		
		Calculos.potencia(valor1, valor2);
		
		System.out.println("\nEntre com um valor, para calculo de Fatorial");
		valor3 = scan.nextInt();
		
		Calculos.fatorial(valor3);
	}

}
