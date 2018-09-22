package udc.edu.psw;

public class RestauranteCaseiro {
	private int total_mesas;
	private float preco_prato;
	private float preco_bebida;
	@SuppressWarnings("unused")
	private float total_vendas;
	
	private int qtd_cliente[];
	private int qtd_bebida[];
	@SuppressWarnings("unused")
	private int mesasOcupadas;
	
	//metodo construtor
	public RestauranteCaseiro(int mesas){
		total_mesas = mesas;
		
		qtd_cliente = new int[total_mesas];
		qtd_bebida = new int[total_mesas];
	}
	
	public void custo_bebida(float precoCusto) {
		preco_bebida = precoCusto *1.4f;
	}
	public void custo_prato(float precoCusto) {
		preco_prato = precoCusto *1.25f;
	}
	
	public int adicionaCliente(int mesa){
		if(qtd_cliente[mesa] == 0)
			mesasOcupadas ++;
		qtd_bebida[mesa]++;
		return qtd_bebida[mesa];	
	}
	
	public int adicionaBebida(int mesa){
		qtd_cliente[mesa]++;
		return qtd_cliente[mesa];
	}
	
	//Calcular o valor da conta
	public float calcularConta(int mesa) {
		float total = qtd_bebida[mesa] * preco_bebida;
		total += qtd_cliente[mesa] * preco_prato;
		return total;
	}
	
	//Fechar a conta da mesa
	public float fecharConta(int mesa) {
		float valor = calcularConta(mesa);
		qtd_bebida[mesa] = 0;
		qtd_cliente[mesa] = 0;
		total_vendas += valor; //fechamento do caixa do dia
		mesasOcupadas --;
		return valor;
	}
	
}
