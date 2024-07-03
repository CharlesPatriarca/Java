package exercico.github;

import java.util.Scanner;

public class Exercicio002 {

	public static void main(String[] args) {
		// Faça um programa que receba de um usuário, um texto e exiba esse texto em letras maiúsculas.
		
		String txt = new String ();
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite sua frase preferida: ");
		txt = entrada.nextLine();
		
		String txtFinal = txt.toUpperCase ();
		
		
		System.out.println(txtFinal);
		
		entrada.close();
	}

}
