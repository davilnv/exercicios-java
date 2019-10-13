package Aula_08;

import Aula_07.Pessoa;

public class Aluno extends Pessoa {
	private int matricula;
	private String curso;
	
	public Aluno(String n, int i, String s, int m, String c) {
		super(n, i, s);
		this.setMatricula(m);
		this.setCurso(c);
	}
	
	public void cancelarMatricula() {
		System.out.println("Matrícula cancelada");
	}
	
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matriucula) {
		this.matricula = matriucula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
}
