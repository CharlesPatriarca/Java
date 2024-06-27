package Scanner_If_else;

import java.util.Scanner;

public class intro_scanner {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite um número: ");
		double resp = entrada.nextDouble();
		System.out.println(resp);

		entrada.close();
	}

}
