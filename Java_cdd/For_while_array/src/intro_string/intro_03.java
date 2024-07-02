package intro_string;

public class intro_03 {

	public static void main(String[] args) {
		
		//CONCATENAÇÃO
		
		String str = "Oi"; String texto = str + " Mundo";
		System.out.println(texto);
		
		System.out.println();
		
		int tres = 3;
		String resultadoFinal = 3 + " palavra " + 3;
		System.out.println(resultadoFinal);
		
		System.out.println();
		
		//SUBSTRING
		
		String str1 = "Hello World";
		String resultado = str1.substring(6);
		System.out.println(resultado);
		
		System.out.println();
		
		String resultado1 = str1.substring(3,8);
		System.out.println(resultado1);
	}

}
