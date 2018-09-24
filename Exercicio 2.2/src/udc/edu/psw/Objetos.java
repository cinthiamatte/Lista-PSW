package udc.edu.psw;

public class Objetos {
	
	private int val = 10;
	private int valor = 5;
	private int res1;
	private int res2;
	
	public void soma() {
		res1 = val + valor;
	}
	
	public void dif() {
		res2 = val - valor;
	}
		
	public String toString() {
	return String.format("Valor da Soma local: %d "
			+ "\nValor da Diferença local: %d", res1, res2);
	}
	
	public int defer(int res) {
		res = res - (val+valor);
		System.out.println("\nValor da diferença Local com Usuario:");
		System.out.print(res);
		return res;
	}
}
