package introducao_string;

public class Exercicio003 {
	
	public static void main(String[] args) {
		// compare os 2 textos abaixo e diga se são iguais.
		
		String texto01 = "Será que são iguais?";
		String texto02 = "Será que são iguais?";
		
		boolean c1 = texto01.equals(texto02);
		boolean c2 = texto02.equalsIgnoreCase(texto01);
		
		System.out.println(c1);
		System.out.println(c2);

	}

}
