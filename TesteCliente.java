package POObjeto;

public class TesteCliente {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cli1= new Cliente ("André",20,123454,"Av rua dos lagos");
				
		cli1.ImprimirInfo();
		System.out.println("\n******MUDOU DE ENDEREÇO******");
		cli1.setEndereço("Rua das árvores");
		cli1.setIdade(25);
		cli1.ImprimirInfo();
	
		
	}
}
