package POObjeto;

public class TesteCliente {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cli1= new Cliente ("Andr�",20,123454,"Av rua dos lagos");
				
		cli1.ImprimirInfo();
		System.out.println("\n******MUDOU DE ENDERE�O******");
		cli1.setEndere�o("Rua das �rvores");
		cli1.setIdade(25);
		cli1.ImprimirInfo();
	
		
	}
}
