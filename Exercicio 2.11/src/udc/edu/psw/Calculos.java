package udc.edu.psw;

public class Calculos {
	public static int potencia(int base, int exp) {
		int pote=1;
		for (int i=1;i<=exp;i++)
		pote = pote * base;
		
		System.out.println("Valor da Potencia");
		System.out.print(pote);
		return pote;
		}
		
		public static int fatorial(int nu) {
		int fat=1;
		for (int i=1;i<=nu;i++)
		fat = fat * i;
		
		System.out.println("\nValor do Fatorial");
		System.out.print(fat);
		return fat;
		}
}
