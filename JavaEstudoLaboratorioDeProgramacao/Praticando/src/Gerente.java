
public class Gerente extends Funcionario{
	private String tipo;
	
	public void cadastrar() {
		System.out.println("Gerente de " + this.getTipo() + " " + this.getNome() + ", cadastrado");
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Gerente" + super.toString() + "[tipo=" + tipo + "]";
	}

}
