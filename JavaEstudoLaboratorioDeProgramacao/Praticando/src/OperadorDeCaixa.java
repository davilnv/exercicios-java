
public final class OperadorDeCaixa extends Funcionario{
	private String login;
	private int senha;
	
	
	public void cadastrar() {
		System.out.println("Operador de Caixa " + this.getNome() + ", cadastrado");
	}

	public String getLogin() {
		return login;
	}

	public void setLoginS(String login) {
		this.login = login;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "OperadorDeCaixa" + super.toString() + "[login=" + login + ", senha=" + senha + "]";
	}
	
}
