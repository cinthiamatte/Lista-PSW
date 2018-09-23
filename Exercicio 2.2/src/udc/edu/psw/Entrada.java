package udc.edu.psw;
import java.util.Scanner;

public class Entrada{
	
	private int um;
	private int dois;
	private int resultado;
	
	Scanner scan = new Scanner(System.in);
	Objetos objeto = new Objetos();
	
	public void Enter () {
		um = scan.nextInt();
		dois = scan.nextInt();
	}
	
	public int calcula() {
		Objetos objeto = new Objetos();
		
		resultado = um + dois;
		return resultado - objeto.soma();
	}
	
	public String toString() {
		return String.format("Valor da diferença: %d", resultado);
	}

}
