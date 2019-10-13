package emprestimoLivros;

public class ServidorAdministrativo extends Usuario{
	private String cargo;
	public void cadastrarLivro(String nome, String tipo, int cod) {
		if (this.getCargo() == "bibliotecario"){
			Livro livro = new Livro();
			livro.setNome(nome);
			livro.setTipo(tipo);
			livro.setCod(cod);
			System.out.println("Livro cadastrado com sucesso!");
		} else {
			System.out.println("Cadastro n�o autorizado!");
		}
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
}
