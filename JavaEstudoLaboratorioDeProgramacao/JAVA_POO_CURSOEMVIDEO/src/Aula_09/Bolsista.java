package Aula_09;

public class Bolsista extends Aluno{
	private float bolsa;
	
	public Bolsista(String n, int i, String s, int ma, String c, float bolsa) {
		super(n, i, s, ma, c);
		this.bolsa = bolsa;
	}
	
	public void renovarBolsa() {
		System.out.println("Renovando bolsa de " + this.getNome());
	}
	
	@Override
	public void pagarMensalidade() {
		System.out.println(this.getNome() + " é bolsista. Pagamento de mensalidade facilitado!");
	}
	
//	@Override
//	public void cancelarMatricula() {
//		
//	} Dá Erro...
	
	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}
}
