package edu.udc.psw;

public class Hora {
	private byte hora; //atributos ou variaveis de instancia
	private byte minuto;// aqui o escopo é maior

	//como diferenciar o escopo da variavel hora da class e do metodo
	//no construtor utiliza this.hora
	
	private byte validaHora(byte hora) {
		if(hora > 23)
			return 0;
		return hora;
	}
	public Hora(byte hora, byte minuto) //metodo construtor sobrecarregado
	{
		this.hora = validaHora(hora);  //this = este, recebe o valor da variavel local, deste metodo
		this.minuto = minuto; //do objeto
	}
	
	//no polimorfismo, oque diferencia o metodo são os prametros
	public Hora() //construtor sobrecarregada // aqui ele esta protegido
	{
		hora = 0;
		minuto = 0;
	}
	
	//criando um metodo de acesso
	public void setHora(byte hora) {
		this.hora = validaHora(hora);
	}
	public byte getHora() {
		return hora;
	}
	//os objetos precissan ser conscistentes, o valores deste objeto devem ser validos
	//TAREFA: REALIZAR OS TESTES PARA QUE NÃO ACEITE UM VALOR INVALIDO, 
	//MODIFICAR A CLASSE PARA QUE ELA SEJA 
	//CONSCISTENTE
	
	public byte incrementaHora() {
		hora++;
		return hora;
	}
	public byte incrementaMinuto() {
		minuto++;
		return minuto;
	}
	public void zerar() {
		hora = 0;
		minuto = 0;
	}
	public String toString() {
		return String.format("%02d:%02d", hora, minuto); //não mostra n tela, sim guarda na memoria
	}
}
