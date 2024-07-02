package introducao_arrays;

import java.util.Scanner;

public class exercicio_02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int total = 0;
		int media = 0;
		int [] notas  = new int [5];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Digite as notas dos alunos: ");
			notas[i] = entrada.nextInt();
		}
		for (int i : notas) {
			total += i;
			//System.out.print(i);
		}
		media = total / notas.length;
		
		System.out.println(media);
		
		entrada.close();
	}

}
