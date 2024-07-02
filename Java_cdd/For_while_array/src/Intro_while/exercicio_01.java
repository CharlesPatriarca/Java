package Intro_while;

import java.util.Scanner;

public class exercicio_01 {

	public static void main(String[] args) {
		int qtdAlunos, totalAlunos;
		double nota, soma = 0, media;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Quantos alunos tem na sua sala? ");
		qtdAlunos = entrada.nextInt();
		totalAlunos = qtdAlunos;
		
		while (qtdAlunos > 0) {
			System.out.println("Informa a nota do aluno: ");
			nota = entrada.nextDouble();
			soma = soma + nota;
			qtdAlunos--;
		}
		media = soma / totalAlunos;
		System.out.printf("A média da sala é %.2f ", media);
		
		entrada.close();
	}

}
