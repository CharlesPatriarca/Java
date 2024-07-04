package scanner_If_else;

import java.util.Scanner;

public class Exercicio002 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite o primeiro número: ");
		int num1 = entrada.nextInt();
		System.out.println("Digite o primeiro número: ");
		int num2 = entrada.nextInt();
		System.out.println("Digite o primeiro número: ");
		int num3 = entrada.nextInt();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("Número 1 é maior");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("Número dois maior");
		} else {
			System.out.println("Número 3 é maior");
		}
		
		entrada.close();
	}

}
