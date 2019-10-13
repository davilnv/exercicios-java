package Aula_07;

public class Aula07 {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Davi", 20, "M");
		Livro livro1 = new Livro("Olokinho", "Faustão", 350, pessoa1);
		livro1.abrir();
		livro1.avancarPag();
		livro1.detalhes();
		livro1.folhear();
		livro1.detalhes();
	}
}
