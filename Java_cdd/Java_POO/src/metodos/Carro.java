package metodos;

public class Carro {
	
	private String cor;
	private double preco;
	private String modelo;

	
	// CONSTRUTOR PADRÃO
	
	public Carro () {
		
	}
	
	// CONSTRUTOR COM 2 PARÂMETROS
	public Carro (String modelo, double preco) {
		// SE FOR ESCOLHIDO O CONSTRUTOR SEM A COR DO VEÍCULO
		//DEFINIMOS A COR PADRÃO COMO SENDO PRETA		
		
		this.cor = "Preta";
		this.modelo = modelo;
		this.preco = preco;
	}
	
	// CONSTRUTOR COM 3 PARÂMETROS
	public Carro (String cor, String modelo, double preco) {
		
		this.cor = cor;
		this.modelo = modelo;
		this.preco = preco;
	}
	
	
	public void Acelerar () {
		System.out.println("Acelera peste");
		
	}
	
	public void Frear () {
		System.out.println("Frea doido");
	}

}
