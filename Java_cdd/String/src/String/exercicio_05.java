package String;

public class exercicio_05 {

	public static void main(String[] args) {
		/* dado o Array a seguir, {"a", "vida", "é", "bela"} faça um programa que crie um string o com
	       texto retirado do Array e imprima. no seguinte formato. 	A VIDA É BELA*/
		
		String array [] = {"a", "vida", "é", "bela"};
		String texto = String.join(" ", array);
		
		String txtFinal = texto.toUpperCase();
		
		
		System.out.println(txtFinal);

	}

}
