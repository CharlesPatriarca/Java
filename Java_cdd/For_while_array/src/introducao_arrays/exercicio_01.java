package introducao_arrays;

import java.util.Scanner;

public class exercicio_01 {

	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner (System.in);
		
		int [] arrayA = new int [10];
		int [] arrayB = new int [10];
		int [] arrayC = new int [10];
		int [] arrayD = new int [10];
		
		
		for (int i = 0; i < arrayA.length; i++) {
			System.out.println("Digite o arrayA: ");
			arrayA[i] = entrada.nextInt();
		}
		
		for (int i = 0; i < arrayB.length; i++) {
			System.out.println("Digite o arrayB: ");
			arrayB[i] = entrada.nextInt();
		}
		
		for (int i = 0; i < arrayC.length; i++) {
			System.out.println("Digite o arrayC: ");
			arrayC[i] = entrada.nextInt();
		}
		
		for (int i = 0; i < arrayD.length; i++) {
			System.out.println("Digite o arrayD: ");
			arrayD[i] = entrada.nextInt();
		}
		
		// --------------------------------------------------------------
		
		for (int i = 0; i < arrayA.length; i++) {
			System.out.print(arrayA[i] + " ");
		}
		System.out.println();
		
		for (int i : arrayB) {
			System.out.printf(i + " ");
		}
		System.out.println();

		
		for (int i : arrayC) {
			System.out.printf(i + " ");
		}
		System.out.println();

		
		for (int i : arrayD) {
			System.out.printf(i + " ");
		}
		System.out.println();

			
		entrada.close();
	}

}
