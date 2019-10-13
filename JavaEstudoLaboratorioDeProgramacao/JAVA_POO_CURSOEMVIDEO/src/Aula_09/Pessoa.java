package Aula_09;

public abstract class Pessoa {
	private String nome;
	private int idade;
	private String sexo;
	
	public Pessoa(String n, int i, String s) {
		this.setNome(n);
		this.setIdade(i);
		this.setSexo(s);
	}
	
	public void fazerAniversario() {
		this.setIdade(this.getIdade() + 1);
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return this.idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return this.sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Pessoa [\nnome=" + nome + "\nidade=" + idade + "\nsexo=" + sexo + "\n]";
	}
	
}
