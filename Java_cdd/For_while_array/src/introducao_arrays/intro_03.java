package introducao_arrays;

public class intro_03 {

	public static void main(String[] args) {
		int [] arrayNum = {87,68,52,5,49,83,45,12,64};
		int total = 0;
		//Adiciona o valor de cada elemento ao total
		
		for (int i : arrayNum)
			total += i;
		System.out.printf("Total de elementos arrayNum: %d\n", total);
	}

}
