package POObjeto;

public class Paciente {
	
	private String nome;
	private String sobreNome;
	private String ultimoNome;
	private float temperatura;
	private float altura;
	private float peso;
	private int idade;
	
	public Paciente (String nome, String sobreNome, String ultimoNome, float altura, float peso, int idade, float temperatura)
	{
		this.nome=nome;
		this.sobreNome=sobreNome;
		this.ultimoNome=ultimoNome;
		this.altura=altura;
		this.peso=peso;
		this.idade=idade;
		this.temperatura=temperatura;
	}
	
	public String getNomeCompleto()
	{
		String nomeCompleto = nome+ " " +sobreNome+ " " +ultimoNome;
		return nomeCompleto;
	}
	
	public void imprimirInfo()
	{
		System.out.println("\nNome do paciente: " +this.getNomeCompleto() + "\nAltura do paciente: "+altura+ "\nPeso: "+peso+ " KG" + "\nIdade: "+idade+ "\nTemperatura: " +temperatura+" ºC");
	}
	
	public void testeFebre() 
	{ 
		if(temperatura>=37.8 && temperatura<=40) 
		{
			System.out.println("\nO paciente está com febre, e precisa de medicação!");	
		}
		else if(temperatura<=35)
		{
			System.out.println("\nO paciente está com HIPOTERMIA, necessita de cuidados URGENTE!!!");
		}
		else if(temperatura>40)
		{
			System.out.println("\nO paciente está com HIPERTERMIA, necessita de cuidados URGENTE!!!!");
		}
		else 
		{	
			System.out.println("\nO paciente está liberado!");
		}

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(float temperatura) {
	
		this.temperatura = temperatura;
	}
	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
	
