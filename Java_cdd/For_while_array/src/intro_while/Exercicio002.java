package intro_while;

public class Exercicio002 {

	public static void main(String[] args) {
		int cont;
		cont = 1;
		
		while (cont <= 100) {
			if (cont % 2 != 0) {
				System.out.println(cont);			
			}
			cont++;
		} 
	}
}
