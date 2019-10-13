
public class Funcionario {
	private String nome;
	private String cpf;
	private int idade;
	private float salario;
	
	public void cadastrar(Funcionario funcionario) {
		Funcionario funcionario1 = new Funcionario();
		funcionario1.setNome(funcionario.getNome());
		funcionario1.setCpf(funcionario.getCpf());
		funcionario1.setIdade(funcionario.getIdade());
		funcionario1.setSalario(funcionario.getSalario());
		System.out.println("Funcionario " + funcionario.getNome() + " cadastrado com sucesso!");
	}
	
	public void cadastrar(OperadorDeCaixa operadordecaixa) {
		OperadorDeCaixa operador = new OperadorDeCaixa();
		operador.setNome(operadordecaixa.getNome());
		operador.setCpf(operadordecaixa.getCpf());
		operador.setIdade(operadordecaixa.getIdade());
		operador.setSalario(operadordecaixa.getSalario());
		operador.setLoginS(operadordecaixa.getLogin());
		operador.setSenha(operadordecaixa.getSenha());
		System.out.println("Operador de Caixa " + operadordecaixa.getNome() + " cadastrado com sucesso!");
	}
	
	public void cadastrar(Gerente gerente) {
		Gerente gerente1 = new Gerente();
		gerente1.setNome(gerente.getNome());
		gerente1.setCpf(gerente.getCpf());
		gerente1.setIdade(gerente.getIdade());
		gerente1.setSalario(gerente.getSalario());
		gerente1.setTipo(gerente.getTipo());
		System.out.println("Gerente de " + gerente.getTipo() + " " + gerente.getNome() + " cadastrado com sucesso!");
	}
	
	public void cadastrar(FuncionarioLimpeza funcionario) {
		Funcionario funcionario1 = new Funcionario();
		funcionario1.setNome(funcionario.getNome());
		funcionario1.setCpf(funcionario.getCpf());
		funcionario1.setIdade(funcionario.getIdade());
		funcionario1.setSalario(funcionario.getSalario());
		System.out.println("Funcionario " + funcionario.getNome() + " cadastrado com sucesso!");
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + nome + ", cpf=" + cpf + ", idade=" + idade + ", salario=" + salario + "]";
	}
	
}
