package exercico_github;

public class Exercico_04 {

	public static void main(String[] args) {
		/* Refaça o exercício anterior, usando a maneira 
		   como o Mestre yoda falaria.. BELA É VIDA A */
		
		String arrayYoda [] = {"bela", "é", "vida", "a"};
		String txt = String.join(" ", arrayYoda);
		
		String txtFinal = txt.toUpperCase();
		
		System.out.println(txtFinal);
		
		
		System.out.println();
		
		
		String arrayYoda2 [] = {"bela", "é", "vida", "a"};
		String txt1 = new String ();
		for (int x = 0; x < arrayYoda2.length; x++) {
			txt1 = txt1 + " " + arrayYoda2[x];
			}
		String a = txt1.trim().toUpperCase();
		System.out.println(a);
		
	}

}
