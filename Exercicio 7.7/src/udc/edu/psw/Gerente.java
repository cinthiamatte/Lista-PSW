package udc.edu.psw;
import java.util.Scanner;
public class Gerente{
	
	public String setor;
	public int salario;
	public Scanner sc = new Scanner(System.in);
	Funcionario f = new Funcionario();
	
	public Gerente() {
		setor = "";
		salario = 0;
	}
	
	public void setorEmpresa() {
		System.out.println("Setor gerenciado:");
		
	}
	
	public void verifica() {
		if(f.cargo == "Gerente") {
			this.salario = 12000;
		}
	}
}
