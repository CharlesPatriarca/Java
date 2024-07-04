package scanner_If_else;

import java.util.Scanner;

public class Exercicio005 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite a letra correspondente ao seu sexo F ou M: ");
		char resposta;
		resposta = entrada.next().charAt(0);
		
		/*
		if (resposta == 'F' || resposta == 'f') {
			System.out.println("Você é princesa");
		} else if (resposta == 'M' || resposta == 'm') {
			System.out.println("Você é ogro");
		} else {
			System.out.println("Opção inválida");
		} */
		
		// operador ternário
		System.out.println(resposta == 'M' ? "Masculino" : "Feminino");

		entrada.close();
	}

}
