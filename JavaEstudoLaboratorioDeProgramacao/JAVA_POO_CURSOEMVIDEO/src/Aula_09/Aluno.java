package Aula_09;

public class Aluno extends Pessoa{
	private int matricula;
	private String curso;
	
	public Aluno(String n, int i, String s, int ma, String c) {
		super(n, i, s);
		this.matricula = ma;
		this.curso = c;
	}
	
	public final void cancelarMatricula() {
		System.out.println("Cancelando a matrícula de " + this.getNome());
	}
	
	public void pagarMensalidade() {
		System.out.println("Pagando mensalidade do aluno " + this.getNome());
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
}
