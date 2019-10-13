package biblioteca;

public class Professor extends Usuario{
	private int siape;
	
	public void finalizar() {
		System.out.println("Professor " + this.getNome() + " cadastrado com sucesso!");
	}
	
	public int getSiape() {
		return this.siape;
	}
	
	public void setSiape(int siape) {
		this.siape = siape;
	}
}
