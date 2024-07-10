package metodos;

public class Aplicacao {

	public static void main(String[] args) {
		
		//CONSTRUTOR SEM PARÂMETROS
		Carro prototipoDeCarro = new Carro ();
		
		// CONSTRUTOR COM 2 PARÂMETROS
		Carro civicPreto = new Carro ("New Civic", 40000);
		
		// CONSTRUTOR COM 3 PARÂMETROS
		Carro golfAmarelo = new Carro ("Preto", "Golf", 38000);
		
		civicPreto.Acelerar();
		golfAmarelo.Frear();
		
	}

}
