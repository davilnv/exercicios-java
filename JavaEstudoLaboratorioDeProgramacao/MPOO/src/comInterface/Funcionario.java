package comInterface;

public class Funcionario implements Caixa, Gerente{
	private String nome;
	private String matricula;
	private int rg;
	private double salario;
	private int cargo;
	
	public Funcionario(String n, int rg, int cg, double sal) {
		this.nome = n;
		this.rg = rg;
		this.cargo = cg;
		this.salario = sal;
	}
	
	public Funcionario(String n, String mat, int cg, double sal) {
		this.nome = n;
		this.matricula = mat;
		this.cargo = cg;
		this.salario = sal;
	}

	@Override
	public String getMatricula() {
		return matricula;
	}

	@Override
	public String getNome() {
		return nome;
	}

	@Override
	public int getRg() {
		return rg;
	}

	@Override
	public double getSalario() {
		return salario;
	}

	@Override
	public void getInfoFuncao() {
		if (this.cargo == FUNCIONARIO_CAIXA) {
			System.out.println("O caixa " + this.getNome() + ", RG " + this.getRg() +
					", recebe R$ " + this.getSalario());
		}
		if (this.cargo == FUNCIONARIO_GERENTE) {
			System.out.println("O gerente " + this.getNome() + ", matricula " +
					this.getMatricula() + ", recebe R$ " + this.getSalario());
		}
	}
	
}
