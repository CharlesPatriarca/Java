package introducao_for;

public class exercicio_03 {

	public static void main(String[] args) {
		
		for (int x = 1; x <= 50; x++) {
			if (x % 2 == 0) {
				x = x / 2;
				System.out.println(x);

			} 
			else {
				x = 3 * x + 1;
				System.out.println(x);
			}
		}
	}
}
