package exemploAbstrato;

public abstract class Empregado {
	String nome, sobrenome, cpf;
	
	public Empregado(String nome, String sobrenome, String cpf) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
	}
	
	public abstract double salario();
}
