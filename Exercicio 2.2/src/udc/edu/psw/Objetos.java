package udc.edu.psw;

public class Objetos {
	
	private int val = 5;
	private int valor = 10;
	private int res;
	
	public int soma() {
		res = val + valor;
		
		System.out.print(res);
		return res;
	}
	
	public int dif() {
		res = val - valor;
		
		System.out.print(res);
		return res;
	}

}
