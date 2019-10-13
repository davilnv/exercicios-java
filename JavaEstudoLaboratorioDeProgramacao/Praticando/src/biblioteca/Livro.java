package biblioteca;

import java.util.Scanner;

public class Livro {
	private String nome;
	private String autor;
	private String editora;
	private String tipo;
	private int totPgs;
	
	public void cadastrar() {
		System.out.println("Cadastro de Livros");
		Scanner teclado = new Scanner(System.in);
		System.out.print("Nome: ");
		String nome = teclado.nextLine();
		System.out.print("Autor: ");
		String autor = teclado.nextLine();
		System.out.print("Editora: ");
		String editora = teclado.nextLine();
		System.out.print("Tipo: ");
		String tipo = teclado.nextLine();
		System.out.print("Total de Páginas: ");
		int totPgs = teclado.nextInt();
		this.setNome(nome);
		this.setAutor(autor);
		this.setEditora(editora);
		this.setTipo(tipo);
		this.setTotPgs(totPgs);
		teclado.close();
		System.out.println("Livro " + nome + " cadastrado com sucesso!");
	}
	
	public void mostrar() {
		System.out.println("Livro [nome=" + this.nome + ", autor=" + this.autor
				+ ", editora=" + this.editora + ", tipo=" + this.tipo
				+ ", totPgs=" + this.totPgs + "]");
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getTotPgs() {
		return totPgs;
	}

	public void setTotPgs(int totPgs) {
		this.totPgs = totPgs;
	}

	@Override
	public String toString() {
		return "Livro [nome=" + nome + ", autor=" + autor + ", editora=" + editora + ", tipo=" + tipo + ", totPgs="
				+ totPgs + "]";
	}
	
}
