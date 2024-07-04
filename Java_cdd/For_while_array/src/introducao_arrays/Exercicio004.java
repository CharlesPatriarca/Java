package introducao_arrays;

import java.util.Arrays;

public class Exercicio004 {

	public static void main(String[] args) {
		int [] num = {20,17,22,18,36,57,80};
		int [] numReverso = new int [7];
		
		for (int i = 6; i >= 0; i--)
		System.out.printf(num[i] + " ");
		
		
		for (int i = 6, x = 0; i >= 0; i--, x++)
		numReverso[x] = num[i];
		
		System.out.println();
		
		for (int i = 0; i < numReverso.length; i++)
		System.out.printf(numReverso[i] + " ");
		
		System.out.println();
		
		
		Arrays.sort(numReverso);
		
		for	 (int i = 0; i < numReverso.length; i++)
			System.out.printf(numReverso[i] + " ");
		
		System.out.println();
		
		for (int i = 0; i < 7 ; i++)
		System.out.printf(numReverso[6-i] + " ");
	}

}
