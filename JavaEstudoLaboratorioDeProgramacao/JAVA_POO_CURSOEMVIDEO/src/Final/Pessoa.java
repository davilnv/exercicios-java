package Final;

public abstract class Pessoa {
	protected String nome;
	protected int idade;
	protected String sexo;
	protected int experiencia;
	
	public Pessoa(String n, int i, String s) {
		this.setNome(n);
		this.setIdade(i);
		this.setSexo(s);
		this.setExperiencia(0);
	}
	
	protected void ganharExp() {
		this.setExperiencia(this.getExperiencia() + 1);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
}
