package biblioteca;

public class Main {
	public static void main(String[] args) {
		Livro livro = new Livro();
		livro.cadastrar();
		livro.mostrar();
		/*
		
		Usuario usuario = new Usuario();
		usuario.cadastrar();
		
		Aluno al = new Aluno();
		al.cadastrar(al);
		
		ServidorAdministrativo ser = new ServidorAdministrativo();
		ser.cadastrar(ser);
		*/
		Professor prof = new Professor();
		prof.cadastrar();

		Emprestimo empre = new Emprestimo();
		empre.cadastrar(livro, prof);
		empre.mostrar();
	}
}
