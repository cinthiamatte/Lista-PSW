package udc.edu.psw;

public class Principal {

	public static void main(String[] args) {
		
		Objetos obj = new Objetos();
		Entrada ent = new Entrada();
		
		
		obj.soma();
		obj.dif();
		System.out.printf(obj.toString());
		ent.Enter();
		ent.defer();
		System.out.printf(ent.toString());
	}
}
