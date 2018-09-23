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
	
	public int defer(int res) {
		res = res - (val+valor);
		return res;
	}
	
	
	public String toString() {
	return String.format("\n\nValor da Soma local: %d \nValor da Diferença local: %d", res1, res2);
	}
}
