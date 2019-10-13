package exemploAbstrato;

public class Horista extends Empregado{
	double precoHora;
	double horasTrabalhadas;

	public Horista(String nome, String sobrenome, String cpf, double precoHora) {
		super(nome, sobrenome, cpf);
		this.precoHora = precoHora;
	}

	@Override
	public double salario() {
		return this.precoHora*this.horasTrabalhadas;
	}
	
	public void somarHorasTrabalhadas(double quant) {
		this.horasTrabalhadas += quant;
	}
}
