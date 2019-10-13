public class OperadorDeCaixa extends Funcionario {
    private float registroFinanceiro;

    public float getRegistroFinanceiro() {
        return registroFinanceiro;
    }

    public void setRegistroFinanceiro(float registroFinanceiro) {
        this.registroFinanceiro = registroFinanceiro;
    }

    @Override
    public String toString() {
        return "Operador de Caixa" + "\n" +
                "Nome: " + this.getNome() + "\n" +
                "CPF: " + this.getCpf() + "\n" +
                "Idade: " + this.getIdade() + "\n" +
                "Salário: " + this.getSalario() + "\n" +
                "Registro Financeiro Diário: " + registroFinanceiro + "\n";
    }
}
