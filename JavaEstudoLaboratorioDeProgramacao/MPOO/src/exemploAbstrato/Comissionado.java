package exemploAbstrato;

public class Comissionado extends Empregado{
	double totalVenda;
	private double taxaComissao;

	public Comissionado(String nome, String sobrenome, String cpf) {
		super(nome, sobrenome, cpf);
	}

	@Override
	public double salario() {
		return (this.totalVenda * this.taxaComissao);
	}
	
	public void somarVenda(double valor) {
		this.totalVenda += valor;
	}

	public double getTaxaComissao() {return taxaComissao;}
	public void setTaxaComissao(double taxaComissao) {this.taxaComissao = taxaComissao;}
}
