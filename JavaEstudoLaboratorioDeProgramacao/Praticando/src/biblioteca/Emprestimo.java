package biblioteca;

public class Emprestimo {
	private Livro livro;
	private Usuario usuario;
	private Aluno aluno;
	private Professor professor;
	private ServidorAdministrativo servidor;
	
	public void cadastrar(Livro livro, Usuario usuario) {
		this.setLivro(livro);
		this.setUsuario(usuario);
	}
	
	public void cadastrar(Livro livro, Aluno aluno) {
		this.setLivro(livro);
		this.setAluno(aluno);
	}
	
	public void cadastrar(Livro livro, Professor professor) {
		this.setLivro(livro);
		this.setProfessor(professor);
	}
	
	public void cadastrar(Livro livro, ServidorAdministrativo servidor) {
		this.setLivro(livro);
		this.setServidor(servidor);
	}
	
	public void mostrar() {
		System.out.println("O livro " + this.livro.getNome() + " foi emprestado ao usuário ");
	}
	
	public Livro getLivro() {
		return livro;
	}
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public ServidorAdministrativo getServidor() {
		return servidor;
	}

	public void setServidor(ServidorAdministrativo servidor) {
		this.servidor = servidor;
	}
	
	
}
