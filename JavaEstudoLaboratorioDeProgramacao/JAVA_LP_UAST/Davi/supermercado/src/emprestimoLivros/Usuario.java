package emprestimoLivros;

public class Usuario {
	private String nome;
	private int idade;
	private String sexo;
	private String cpf;
	public void cadastrar(String n, int i, String s, String c) {
		this.setNome(n);
		this.setIdade(i);
		this.setSexo(s);
		this.setCpf(c);
		System.out.println("Cadastrado com sucesso!");
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
}
