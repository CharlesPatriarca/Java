package introducao.string;

public class Intro010 {

	public static void main(String[] args) {
		// endsWhit e startsWith
		
		String valor = "CDD - Java";
		System.out.println(valor.endsWith("Java"));
		System.out.println(valor.startsWith("C"));
		System.out.println(valor.startsWith("DD", 1));
		
	}

}
