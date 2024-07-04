package scanner_If_else;

import java.util.Scanner;

public class Exercicio004 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite sua primeira nota: ");
		double nota1 = entrada.nextDouble();
		System.out.println("Digite sua segunda nota: ");
		double nota2 = entrada.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		System.out.printf("Sua média foi %.1f \n", media);
		
		if (media >= 7) {
			System.out.printf("Aluno aprovado com média: %.1f", media);
		} else if (media >= 5) {
			System.out.printf("Aluno em recuperação com média: %.1f", media);
		} else {
			System.out.println("Vai estudar vagabundo");
		}
		entrada.close();
	}

}
