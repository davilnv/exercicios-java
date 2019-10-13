package Aula_04;

public class ContaResposta {
	// Atributos
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	// Métodos
	public ContaResposta() {
		this.setSaldo(0);
		this.setStatus(false);
	}
	public String testStatus() {
		if (this.getStatus() == true) {
			return "Aberta";
		} else {
			return "Fechada";
		}
	}
	public void estadoAtual() {
		System.out.println("--------------------------------------");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Nome do Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status da conta: " + this.testStatus());
	}
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if (t == "cc") {
			this.setSaldo(50);
		} else {
			this.setSaldo(150);
		}
		System.out.println("Conta aberta com sucesso!");
	}
	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Conta não pode ser fechada, pois ainda tem dinheiro");
		} else if (this.getSaldo() < 0) {
			System.out.println("Conta não pode ser fechada, pois você está com saldo negativo");
		} else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso!");
		}
	}
	public void depositar(float valor) {
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() + valor);
			System.out.println("Depósito realizado na conta de " + this.getDono());
		} else {
			System.out.println("Não foi possível realizar depósito, pois a conta está fechada");
		}
	}
	public void sacar(float valor) {
		if (this.getStatus()) {
			if (this.getSaldo() >= valor) {
				this.setSaldo(this.getSaldo() - valor);
				System.out.println("Saque realizado na conta de " + this.getDono());
			} else {
				System.out.println("Saldo insuficiente para realizar saque!");
			}
		} else {
			System.out.println("Não foi possível realizar depósito, pois a conta está fechada");
		}
	}
	public void pagaMensal() {
		float valor = 0;
		if (this.getTipo() == "cc") {
			valor = 12;
		} else if (this.getTipo() == "cp") {
			valor = 20;
		}
		if (this.getStatus()) {
			if (this.getSaldo() >= valor) {
				this.setSaldo(this.getSaldo() - valor);
			} else {
				System.out.println("Saldo insuficiente para realizar pagamento de mensalidade");
			}
		} else {
			System.out.println("Não foi possível realizar pagamento de mensalidade, pois a conta está fechada");
		}
	}
	public int getNumConta() {
		return this.numConta;
	}
	public void setNumConta(int numero) {
		this.numConta = numero;
	}
	public String getTipo() {
		return this.tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDono() {
		return this.dono;
	}
	public void setDono(String dono) {
		this.dono = dono;;
	}
	public float getSaldo() {
		return this.saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public boolean getStatus() {
		return this.status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
}
