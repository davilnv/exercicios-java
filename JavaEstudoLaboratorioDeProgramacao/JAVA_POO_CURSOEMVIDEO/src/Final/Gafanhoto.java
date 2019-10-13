package Final;

public class Gafanhoto extends Pessoa{
	private Login login;
	private int totAssistido;
	
	public Gafanhoto(String n, int i, String s, Login login) {
		super(n, i, s);
		this.setLogin(login);
		this.setTotAssistido(0);
	}
	
	public void viuMaiUm() {
		if (this.getLogin().getLogado()) {
			this.totAssistido ++;
		} else {
			System.out.println("Não pode assistir um vídeo sem estar logado");
		}
	}

	private Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public int getTotAssistido() {
		return totAssistido;
	}

	public void setTotAssistido(int totAssistido) {
		this.totAssistido = totAssistido;
	}

	@Override
	public String toString() {
		return "Gafanhoto [login=" + login.getLogin() + ", totAssistido=" + totAssistido + ", nome=" + nome + ", idade=" + idade
				+ ", sexo=" + sexo + ", experiencia=" + experiencia + "]";
	}
	
}
