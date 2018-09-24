package udc.edu.psw;

import java.util.Scanner;

public class Soma {
	
	private static Scanner scan;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int vetor[] = new int [n];
		int i;
		
		scan = new Scanner(System.in);
		
		for(i=0 ; i<n; i++) 
		{
			System.out.printf("Informe %2do. valor de %d: ", (i+1), n);
			vetor[i] = scan.nextInt();
		}
		
		  int soma = 0;

	    for (i=0; i<n; i++) {
	      soma = soma + vetor[i];
	    }
	    
	    System.out.printf("Soma dos valores do Vetor: %d", soma);
	}

}
