package udc.edu.psw;

public class MesaRestaurante {
	private int qtd_cliente; 		//cliente da mesa obs conta como prato
	private int qtd_bebida;		 	//bebida por mesa
	private int limite_cliente; 	//maximo de clientes na mesa



	public void adiciona_cliente() {
		if(qtd_cliente < limite_cliente)
		qtd_cliente++;
	}//Adiciona um cliente na mesa
		
	
	public void adiciona_bebida() {
		qtd_bebida++;
	}//Adiciona uma bebida
	
	
	public float calcular_conta(float preco_bebida, float preco_prato) {
		float total = qtd_bebida * preco_bebida;
		total += qtd_cliente * preco_prato;
		return total;
	}//Calcular o valor da conta de uma determinada mesa
	
	public float calcularConta_cliente(float preco_bebida, float preco_prato) {
		return calcular_conta(preco_bebida, preco_prato) / qtd_cliente;
	}
	
	public void fechar_mesa() {
		qtd_bebida = 0;
		qtd_cliente = 0;
	}

}
