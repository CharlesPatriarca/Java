package heranca;

public class Faculdade {
	
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Charles", "754.857.658-58", "81987548625");
		aluno1.matricula = "00214587";
		
		Professor prof1 = new Professor ("Daniel Araujo", "478.854.875-87", "81965234587");
		prof1.salario = 8547.54;
		prof1.disciplinas = "Java";
		
		Funcionario func1 = new Funcionario ("Gabriel Silva", "985.236.745-590", "81965874524");
		func1.salario = 245.87;
		func1.cargo = "Faxineiro";
		
		
	}

}
