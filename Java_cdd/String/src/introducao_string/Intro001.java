package introducao_string;

public class Intro001 {

	public static void main(String[] args) {
		// CRIANDO STRING
		String nova = new String ();
		nova = "Hello World!";
		System.out.println(nova);
		
		System.out.println();
		
		// CONVERTENDO ARRAY EM STRING
		
		char caracteres [] = {'a', 'b', 'c'};
		String texto = new String (caracteres);
		System.out.println(texto);
		
		
	}

}
