package biblioteca;

public class Aluno extends Usuario{
	private int matricula;
	
	public void finalizar() {
		System.out.println("Aluno " + this.getNome() + " cadastrado com sucesso!");
	}
	public int getMatricula() {
		return this.matricula;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
}
