package Aula_08;

import Aula_07.Pessoa;

public class Professor extends Pessoa{
	private String especialidade;
	private float salario;
	
	public Professor(String n, int i, String s, String e, float sa) {
		super(n, i, s);
		this.setEspecialidade(e);
		this.setSalario(sa);
	}
	
	public void receberAum(float aumento) {
		this.setSalario(this.getSalario() + aumento);
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
}
