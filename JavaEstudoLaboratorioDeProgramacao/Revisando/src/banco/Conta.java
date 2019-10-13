package banco;

public abstract class Conta {
    private int agencia;
    private int numeroConta;
    private String nome;
    private String cpf;
    private float saldo;

    public Conta() {
    }

    public void sacar() {

    }

    public void depositar() {

    }

    public void transferir() {

    }
    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta" + "\n" +
                "Agência:" + agencia + "\n" +
                "Número da Conta: " + numeroConta + "\n" +
                "Nome: " + nome + "\n";
    }
}
