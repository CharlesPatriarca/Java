package scanner_If_else;

import java.util.Scanner;

public class Exercicio003 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		
		System.out.println("Digite um número: ");
		int dia = entrada.nextInt ();
		
		if (dia == 1) {
			System.out.println("Segunda-feira");
		} else if (dia == 2) {
			System.out.println("Terça-feira");
		} else if (dia == 3) {
			System.out.println("Quarta-feira");
		} else if (dia == 4) {
			System.out.println("Quinta-feira");
		} else if (dia == 5) {
			System.out.println("Sexta-feira");
		} else if (dia == 6) {
			System.out.println("Sábado");
		} else if (dia == 7) {
			System.out.println("Domingo");
		} else {
			System.out.println("Valor inválido");
		}
		entrada.close();
	
	}

}
