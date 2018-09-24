package udc.edu.psw;
import java.util.Scanner;

public class Entrada{
	
	private int um;
	private int dois;
	private int resultado, aux;
	
	Scanner scan = new Scanner(System.in);
	Objetos objeto = new Objetos();
	
	public void Enter () {
		System.out.println("\nEntre com dois Valores");
		um = scan.nextInt();
		dois = scan.nextInt();
		
		resultado = um + dois;
	}
			
	public String toString() {
		return String.format("\nValor da Soma Usuario: %d", resultado);
	}
	
	public void defer() {
		aux = resultado;
		objeto.defer(aux);
	}
}
