package udc.edu.psw;

import java.util.Scanner;

public class Principal {

	public static String cliente;
	public static String bebida;
	public static String test = "sim";
	public static Scanner scan = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		RestauranteCaseiro restaurante = new RestauranteCaseiro(25);
		@SuppressWarnings("unused")
		MesaRestaurante mesa = new MesaRestaurante();
		
		System.out.println("Custo Bebida");
		float f = scan.nextFloat();
		restaurante.custo_bebida(f);
		System.out.println("Custo Prato");
		f = scan.nextFloat();
		restaurante.custo_prato(f);
		
		
		System.out.println("Novo cliente ?");
		cliente = scan.nextLine();
		if(cliente == test ) 
		restaurante.adicionaCliente(1);
		
		System.out.println("Adicionar bebida?");
		bebida = scan.nextLine();
		if(bebida == test ) 
		restaurante.adicionaBebida(1);
		
		System.out.printf("Valor da conta da mesa: %.2f",
		restaurante.calcularConta(1));
	}
}



