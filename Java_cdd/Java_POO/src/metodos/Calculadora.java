package metodos;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner (System.in);
		
		SomarMetodos adicao = new SomarMetodos();		
		SomarMetodos subtracao = new SomarMetodos();
		SomarMetodos multiplicacao = new SomarMetodos();
		SomarMetodos divisao = new SomarMetodos();
		
		int resposta = 0;
		
		while (resposta != 9) {
		
		System.out.println(" [1] Para adição com dois números \n [2] Para adição com trêa números \n"
						+ " [3] Para subtração com dois números \n [4] Para subtração com dois números \n"
						+ " [5] Para multiplicação com dois números \n [6] Para multiplicação com dois números \n"
						+ " [7] Para Divisão com dois números \n [8] Para Divisão com dois números \n"
						+ " [9] Sair da calculadora");
		
		System.out.println();

		
		System.out.println("Qual operação você deseja? ");
		resposta = entrada.nextInt();
		

		if (resposta == 1) {
			System.out.println("Digite o primeiro número da operação: ");
			int a = entrada.nextInt();
			
			System.out.println("Digite o primeiro número da operação: ");
			int b = entrada.nextInt();
			
			int resultado0 = adicao.somar(a, b);
			
			System.out.printf("O resultado da soma é: %s \n" , resultado0);
		}
		
		else if (resposta == 2) {
			System.out.println("Digite o primeiro número da operação: ");
			int a = entrada.nextInt();
			
			System.out.println("Digite o primeiro número da operação: ");
			int b = entrada.nextInt();
			
			System.out.println("Digite o primeiro número da operação: ");
			int c = entrada.nextInt();
			
			int resultado1 = adicao.somar(a, b, c);
			
			System.out.printf("O resultado da soma é: %s \n" , resultado1);
		}
		
		else if (resposta == 3) {
			System.out.println("Digite o primeiro número da operação: ");
			int a = entrada.nextInt();
			
			System.out.println("Digite o primeiro número da operação: ");
			int b = entrada.nextInt();
			
			int resultado2 = subtracao.subtrair(a, b);
			
			System.out.printf("O resultado da subtração é: %s \n", resultado2);
		}
		
		else if (resposta == 4) {
			System.out.println("Digite o primeiro número da operação: ");
			int a = entrada.nextInt();
			
			System.out.println("Digite o primeiro número da operação: ");
			int b = entrada.nextInt();
			
			System.out.println("Digite o primeiro número da operação: ");
			int c = entrada.nextInt();
			
			int resultado3 = subtracao.subtrair(a, b, c);
			
			System.out.printf("O resultado da subtração é: %s \n", resultado3);
		}
		
		else if (resposta == 5) {
			System.out.println("Digite o primeiro número da operação: ");
			int a = entrada.nextInt();
			
			System.out.println("Digite o primeiro número da operação: ");
			int b = entrada.nextInt();
			
			int resultado4 = multiplicacao.multiplicar(a, b);
			
			System.out.printf("O resultado da multiplicação é: %s \n", resultado4);
		}
		
		else if (resposta == 6) {
			System.out.println("Digite o primeiro número da operação: ");
			int a = entrada.nextInt();
			
			System.out.println("Digite o primeiro número da operação: ");
			int b = entrada.nextInt();
			
			System.out.println("Digite o primeiro número da operação: ");
			int c = entrada.nextInt();
			
			int resultado5 = multiplicacao.multiplicar(a, b, c);
			
			System.out.printf("O resultado da multiplicação é: %s \n", resultado5);
		}
		
		else if (resposta == 7) {
			System.out.println("Digite o primeiro número da operação: ");
			int a = entrada.nextInt();
			
			System.out.println("Digite o primeiro número da operação: ");
			int b = entrada.nextInt();
			
			int resultado6 = divisao.dividir(a, b);
			
			System.out.printf("O resultado da divisão é: %s \n", resultado6);
		}
		
		else if (resposta == 8) {
			System.out.println("Digite o primeiro número da operação: ");
			int a = entrada.nextInt();
			
			System.out.println("Digite o primeiro número da operação: ");
			int b = entrada.nextInt();
			
			System.out.println("Digite o primeiro número da operação: ");
			int c = entrada.nextInt();
			
			int resultado7 = divisao.dividir(a, b, c);
			
			System.out.printf("O resultado da divisão é: %s \n", resultado7);
		}
		

		
		}
		entrada.close();
	}

}
