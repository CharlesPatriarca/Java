package intro_string;

import java.util.Scanner;
import java.util.StringTokenizer;

public class exercicio_02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);		
				
		System.out.println("Digite o texto desejado: ");
		StringTokenizer texto = new StringTokenizer (entrada.nextLine());

		
		System.out.println(texto.countTokens());
		
		
		
	}

}
