package Intro_while;

public class exercicio_02 {

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
