package scanner.If.elsee;

import java.util.Scanner;

public class Exercicio001 {

	public static void main(String[] args) {
		Scanner num1 = new Scanner (System.in);
		System.out.println("Digite um número: ");
		int resp = num1.nextInt();
				
		if (resp < 0) {
			System.out.println("O número é negativo");
		
		}else if (resp > 0) {
			System.out.println("O número é positivo");
					
		} else {
			System.out.println("Número nem negativo nem positivo");
		}
		num1.close();
	}

}
