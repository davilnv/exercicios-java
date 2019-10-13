package empresa;

public class Funcionario {
	private String nome;
	private int idade;
	private String cpf;
	private float salario;
	
	public Funcionario() {
	}
	
	public Funcionario(String nome, int idade, String cpf, float salario) {
		this.setNome(nome);
		this.setIdade(idade);
		this.setCpf(cpf);
		this.setSalario(salario);
	}
	
	public void trabalhar(){
		System.out.println("Estou trabalhando!");
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", idade=" + idade + ", cpf=" + cpf + ", salario=" + salario + "]";
	}
}
