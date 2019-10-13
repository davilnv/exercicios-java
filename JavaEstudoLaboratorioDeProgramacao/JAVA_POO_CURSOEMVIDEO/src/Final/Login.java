package Final;

public class Login {
	protected String login;
	protected int senha;
	private boolean logado;
	
	public Login(String l, int s, boolean log) {
		this.setLogin(l);
		this.setSenha(s);
		this.setLogado(log);
	}
	
	public String getLogin() {
		return login;
	}

	private void setLogin(String login) {
		this.login = login;
	}
	
	private void setSenha(int senha) {
		this.senha = senha;
	}
	
	private void setLogado(boolean logado) {
		this.logado = logado;
	}

	public boolean getLogado() {
		return this.logado;
	}
}
