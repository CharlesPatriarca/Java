package intro_string;

public class exercicio_01 {

	public static void main(String[] args) {
		String texto = new String (" texto para retirar espaços no início e fim ");
		
		String str = texto.trim();
		System.out.println(str);
	}

}
