package introducao.string;

public class Intro009 {

	public static void main(String[] args) {
		//MÉTODO QUE MOSTRA A POSIÇÃO DA LETRA NO INÍCIO
		
		String str = "Hello World World2";
		int pos = str.indexOf ("l");
		
		System.out.println(pos);
		
		System.out.println();
		
		//MÉTODO QUE MOSTRA A POSIÇÃO DA LETRA NO FINAL
		
		int pos1 = str.lastIndexOf("l");
		System.out.println(pos1);
		
	}

}
