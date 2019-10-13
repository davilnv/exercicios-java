package Aula_04;

public class Conta {
	private int numConta;
	protected String tipo; // cc ou cp
	private String nomeDono;
	private float saldo;
	private boolean status;
	public Conta(int n, String t, String d) {
		this.numConta = n;
		this.tipo = t;
		this.nomeDono = d;
		this.status = false;
		this.testeTipo(this.tipo);
	}
	private void testeTipo(String tipo) {
		if(this.tipo == "cc") {
			this.saldo = 50.0f;
		} else if (this.tipo == "cp") {
			this.saldo = 150.0f;
		}
	}
	public void status() {
		if (this.status == true) {
			if (this.tipo == "cc") {
				System.out.println("-- Sistema Conta Corrente --");
				System.out.println("Nome: " + this.nomeDono);
				System.out.println("Número da Conta: " + this.numConta);
				System.out.println("Saldo: " + this.saldo);
				System.out.println();
			} else if (this.tipo == "cp") {
				System.out.println("-- Sistema Conta Poupança --");
				System.out.println("Nome: " + this.nomeDono);
				System.out.println("Número da Conta: " + this.numConta);
				System.out.println("Saldo: " + this.saldo);
				System.out.println();
			} else {
				System.out.println("Tipo de conta inválido");
			}
		} else {
			System.out.println("Essa conta está fechada");
		}
	}
	public void abrirConta(int num) {
		if (num == this.numConta) {
			this.status = true;
		} else {
			System.out.println("Número de conta inválido");
		}
	}
	public void fecharConta() {
		if (this.status == true) {
			if (this.saldo == 0) {
				this.status = false;
			} else if (this.saldo > 0) {
				System.out.println("Sua conta ainda possui dinheiro, não é possível fechar!");
			} else {
				System.out.println("Sua conta está com o saldo deveder, não é possível fechar!");
			}
		} else {
			System.out.println("Essa conta já está fechada");
		}
	}
	public void depositar(float valorDeposito) {
		if (this.status == true) {
			this.saldo += valorDeposito;
			System.out.println("Deposito de R$ " + valorDeposito + " realizado com sucesso!");
		} else {
			System.out.println("Essa conta está fechada, não é possível realizar transação!");
		}
	}
	public void sacar(float valorSaque) {
		if (this.status == true) {
			if (this.saldo >= valorSaque) {
				this.saldo -= valorSaque;
				System.out.println("Saque de R$ " + valorSaque + " realizado com sucesso!");
			} else {
				System.out.println("Saldo indisponível para saque!");
			}
		} else {
			System.out.println("Essa conta está fechada, não é possível realizar transação!");
		}
	}
	public void pagarMensal() {
		if (this.status == true) {
			if (this.tipo == "cc") {
				this.saldo -= 12.0f;	
				System.out.println("Pagamento de mensalidade de conta corrente realizado!");
			} if (this.tipo == "cp") {
				this.saldo -= 20.0f;
				System.out.println("Pagamento de mensalidade de conta poupança realizado!");
			}
		} else {
			System.out.println("Essa conta está fechada, não é possível realizar transação!");
		}
	}
}
