package emprestimoLivros;

public class Main {
	public static void main(String[] args) {
		Professor professor = new Professor();
		professor.cadastrar("Ana Patricia", 24, "F", "12333");
		professor.setSiape(12212);
		ServidorAdministrativo servidor = new ServidorAdministrativo();
		servidor.cadastrar("Gabryel", 19, "M", "0000");
		servidor.setCargo("bibliotecario");
		servidor.cadastrarLivro("The Walking Dead", "Suspense", 123);
		
	}
}
