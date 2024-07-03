package scanner.If.elsee;

import java.util.Scanner;

public class Exercicio006 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Telefonou para a vítima?");
		char resp1 = entrada.next().charAt(0);
		
		System.out.println("Esteve no local do crime?");
		char resp2 = entrada.next().charAt(0);
		
		System.out.println("Mora perto da vítima?");
		char resp3 = entrada.next().charAt(0);

		System.out.println("Devia para a vítima?");
		char resp4 = entrada.next().charAt(0);

		System.out.println("Já trabalhou com a vítima?");
		char resp5 = entrada.next().charAt(0);
		
		System.out.println(resp1);
		System.out.println(resp2);
		System.out.println(resp3);
		System.out.println(resp4);
		System.out.println(resp5);
		
				
		
	entrada.close();
	
	}

}
