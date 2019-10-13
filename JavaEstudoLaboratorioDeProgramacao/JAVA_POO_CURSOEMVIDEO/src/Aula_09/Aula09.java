package Aula_09;

public class Aula09 {
	public static void main(String[] args) {
		//Pessoa pessoa = new Pessoa();
		Visitante visitante = new Visitante("Jão", 20, "M");
		System.out.println(visitante.toString());
		Aluno aluno = new Aluno("Fulano", 30, "M", 123, "SI");
		System.out.println(aluno.toString());
		aluno.pagarMensalidade();
		Bolsista bolsista = new Bolsista("Davi", 20, "M", 1234, "SI", 950);
		bolsista.pagarMensalidade();
	}
}
