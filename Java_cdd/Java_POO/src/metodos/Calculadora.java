package metodos;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		int resposta;
		int resultado;
		int a;
		int b;
		int c;
		
		Scanner entrada = new Scanner (System.in);
		
		SomarMetodos adicao = new SomarMetodos();		
		SomarMetodos subtracao = new SomarMetodos();
		SomarMetodos multiplicacao = new SomarMetodos();
		SomarMetodos divisao = new SomarMetodos();
		
		resposta = 15;
		
		while (resposta != 0) {
		
		System.out.println("                             BEM-VINDO(A) A CALCULADORA!                                   \n"
						 + "                      ESCOLHA ENTRE 0-8 PARA REALIZAR UMA AÇÃO:                            \n \n"
						 + "        OPERAÇÃO COM DOIS NÚMERO                    OPERAÇÃO COM TRÊS NÚMEROS              \n \n"
						 + " [1] - Para adição com dois números        | [5] - Para adição com três números            \n"
						 + " [2] - Para subtração com dois números     | [6] - Para subtração com três números         \n"
						 + " [3] - Para multiplicação com dois números | [7] - Para multiplicação com três números     \n"
						 + " [4] - Para Divisão com dois números       | [8] - Para Divisão com três números           \n"
						 + " [0] - Sair da calculadora                 |                                               \n"
						 + "------------------------------------------------------------------------------------------ \n");
		

		System.out.println("QUAL A OPÇÃO DESEJADA? ");
		resposta = entrada.nextInt();
		
		System.out.println();
		
		if (resposta == 1) {
			System.out.println("Digite o primeiro número da operação: ");
			a = entrada.nextInt();
			
			System.out.println("Digite o segundo número da operação: ");
			b = entrada.nextInt();
			
			resultado = adicao.somar(a, b);
			
			System.out.printf("O resultado da soma de %s + %s é: %s \n" , a, b, resultado);
		}
		
		else if (resposta == 5) {
			System.out.println("Digite o primeiro número da operação: ");
			a = entrada.nextInt();
			
			System.out.println("Digite o segundo número da operação: ");
			b = entrada.nextInt();
			
			System.out.println("Digite o terceiro número da operação: ");
			c = entrada.nextInt();
			
			resultado = adicao.somar(a, b, c);
			
			System.out.printf("O resultado da soma de %s + %s + %s é: %s \n" , a, b, c, resultado);
		}
		
		else if (resposta == 2) {
			System.out.println("Digite o primeiro número da operação: ");
			a = entrada.nextInt();
			
			System.out.println("Digite o segundo número da operação: ");
			b = entrada.nextInt();
			
			resultado = subtracao.subtrair(a, b);
			
			System.out.printf("O resultado da subtração de %s - %s é: %s \n" , a, b, resultado);
		}
		
		else if (resposta == 6) {
			System.out.println("Digite o primeiro número da operação: ");
			a = entrada.nextInt();
			
			System.out.println("Digite o segundo número da operação: ");
			b = entrada.nextInt();
			
			System.out.println("Digite o terceiro número da operação: ");
			c = entrada.nextInt();
			
			resultado = subtracao.subtrair(a, b, c);
			
			System.out.printf("O resultado da subtração de %s - %s - %s é: %s \n" , a, b, c, resultado);
		}
		
		else if (resposta == 3) {
			System.out.println("Digite o primeiro número da operação: ");
			a = entrada.nextInt();
			
			System.out.println("Digite o segundo número da operação: ");
			b = entrada.nextInt();
			
			resultado = multiplicacao.multiplicar(a, b);
			
			System.out.printf("O resultado da multiplicação de %s * %s é: %s \n" , a, b, resultado);
		}
		
		else if (resposta == 7) {
			System.out.println("Digite o primeiro número da operação: ");
			a = entrada.nextInt();
			
			System.out.println("Digite o segundo número da operação: ");
			b = entrada.nextInt();
			
			System.out.println("Digite o terceiro número da operação: ");
			c = entrada.nextInt();
			
			resultado = multiplicacao.multiplicar(a, b, c);
			
			System.out.printf("O resultado da multiplicação de %s * %s * %s é: %s \n" , a, b, c, resultado);
		}
		
		else if (resposta == 4) {
			System.out.println("Digite o primeiro número da operação: ");
			a = entrada.nextInt();
			
			System.out.println("Digite o segundo número da operação: ");
			b = entrada.nextInt();
			
			resultado = divisao.dividir(a, b);
			
			System.out.printf("O resultado da divisão de %s / %s é: %s \n" , a, b, resultado);
		}
		
		else if (resposta == 8) {
			System.out.println("Digite o primeiro número da operação: ");
			a = entrada.nextInt();
			
			System.out.println("Digite o segundo número da operação: ");
			b = entrada.nextInt();
			
			System.out.println("Digite o terceiro número da operação: ");
			c = entrada.nextInt();
			
			resultado = divisao.dividir(a, b, c);
			
			System.out.printf("O resultado da divisão de %s / %s / %s é: %s \n" , a, b, c, resultado);
		}
		
		else if (resposta == 0) {
			System.out.println("Até a próxima! ");
		}
		
		else {
			System.out.println("OPÇÃO INVÁLIDA, DIGITE NOVAMENTE!");
		}
		
		System.out.println();
		
		System.out.println("------------------------------------------------------------------------------------------");
		
		}
		entrada.close();
	}

}
