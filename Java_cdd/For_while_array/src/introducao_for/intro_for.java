package introducao_for;

public class intro_for {
	public static void main(String[] args) {
		int x;
		int y;
		x = 1;
		y = 100;
		
		/*for (int i = 0; i < 10; i++) {
			System.out.println("Olá");*/
		
		
		for (int i = x; i <= y; i++) {
			if (i % 3 == 0) {
				System.out.println("Achei um número dicisível por 19 entre x e y");
				System.out.println(i);
				break;
			}
		}
	}

}
