package Aula_08;

public class Aula08 {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Jão", 25, "M", 123, "SI");
		System.out.println(aluno1.getIdade());
		aluno1.fazerAniversario();
		System.out.println(aluno1.getIdade());
	}
}
