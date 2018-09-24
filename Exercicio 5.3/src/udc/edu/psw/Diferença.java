package udc.edu.psw;

import java.util.Scanner;

public class Diferença {
	
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
		
	    int menor = vetor[0]; 
	    int maior = vetor[0];
	    for (i=0; i<n; i++) {
	 
	      if (vetor[i] < menor)
	         menor = vetor[i];
	 
	      if (vetor[i] > maior)
	         maior = vetor[i];
	    }

	    System.out.printf("\n");
	    for (i=0; i<n; i++) {
	      if (vetor[i] == menor)
	        System.out.printf("Valor[%d] = %2d <--- menor valor\n", i, vetor[i]);
	      else if (vetor[i] == maior)
	              System.out.printf("Valor[%d] = %2d <--- maior valor\n", i, vetor[i]);
	           else System.out.printf("Valor[%d] = %2d\n", i, vetor[i]);
	    }

	  }
	 
	}

