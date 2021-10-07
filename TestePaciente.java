package POObjeto;

public class TestePaciente {

	public static void main(String[] args) {
												// nome, altura , peso, idade, temperatura
		Paciente paciente1 = new Paciente("Josue","Firmino","Zacaria",182,95,28,36);
		Paciente paciente2 = new Paciente("Jeska","Lopes"," ",182,95,28,40);
		Paciente paciente3 = new Paciente("Luis ","Guerreiro"," ",182,95,28,38);
		Paciente paciente4 = new Paciente("Mayra","Rodrigues","Souza",182,95,28,35);
		
		paciente1.imprimirInfo();
		paciente1.testeFebre();
		paciente2.imprimirInfo();
		paciente2.testeFebre();
		paciente3.imprimirInfo();
		paciente3.testeFebre();
		paciente4.imprimirInfo();
		paciente4.testeFebre();
		

	}

}

