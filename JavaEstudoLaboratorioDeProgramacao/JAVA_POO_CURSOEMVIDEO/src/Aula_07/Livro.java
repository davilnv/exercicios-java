package Aula_07;

import java.util.Random;

public class Livro implements Publicacao{
	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	public Livro(String t, String a, int tot, Pessoa le) {
		this.setAberto(false);
		this.setPagAtual(0);
		this.setTitulo(t);
		this.setAutor(a);
		this.setTotPaginas(tot);
		this.setLeitor(le);
	}
	
	public void detalhes() {
		System.out.println("Título: " + this.getTitulo());
		System.out.println("Autor: " + this.getAutor());
		System.out.println("Total de Páginas: " + this.getTotPaginas());
		System.out.println("Página Atual: " + this.getPagAtual());
		System.out.println("Situação: " + this.getAberto());
	}

	@Override
	public void abrir() {
		if (this.getAberto() == false) {
			this.setAberto(true);
		} else {
			System.out.println("O Livro já está aberto");
		}
	}

	@Override
	public void fechar() {
		if (this.getAberto() == true) {
			this.setAberto(false);
		} else {
			System.out.println("O Livro já está fechado");
		}
		
	}

	@Override
	public void folhear() {
		if (this.getAberto()) {
			Random aleatorio = new Random();
			int folhear = aleatorio.nextInt(this.getTotPaginas());
			this.setPagAtual(folhear);
		} else {
			System.out.println("O Livro está fechado!");
		}
	}

	@Override
	public void avancarPag() {
		if (this.getAberto()) {
			this.setPagAtual(this.getPagAtual() + 1);
		} else {
			System.out.println("O Livro está fechado!");
		}
	}

	@Override
	public void voltarPag() {
		if (this.getAberto()) {
			this.setPagAtual(this.getPagAtual() - 1);
		} else {
			System.out.println("O Livro está fechado!");
		}
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getTotPaginas() {
		return totPaginas;
	}
	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}
	public int getPagAtual() {
		return pagAtual;
	}
	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}
	public boolean getAberto() {
		return aberto;
	}
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	public Pessoa getLeitor() {
		return leitor;
	}
	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}
}
