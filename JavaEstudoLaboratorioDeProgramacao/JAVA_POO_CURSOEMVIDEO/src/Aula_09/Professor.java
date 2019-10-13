package Aula_09;

public final class Professor extends Pessoa{
	private String especialidade;
	private float salario;
	
	public Professor(String n, int i, String s, String e, float sal) {
		super(n, i, s);
		this.especialidade = e;
		this.salario = sal;
	}
	
	public void receberAum(float aumento) {
		this.salario += aumento;
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
