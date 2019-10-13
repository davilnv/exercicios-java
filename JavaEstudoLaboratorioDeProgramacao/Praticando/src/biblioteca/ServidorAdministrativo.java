package biblioteca;

public class ServidorAdministrativo extends Usuario{
	private String cargo;
	
	public void finalizar() {
		System.out.println("Servidor Administrativo " + this.getNome() + " cadastrado com sucesso!");
	}
	
	public String getCargo() {
		return this.cargo;
	}
	
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
}
