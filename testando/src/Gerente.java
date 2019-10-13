public class Gerente extends Funcionario {
    private String acesso;

    public String getAcesso() {
        return acesso;
    }

    public void setAcesso(String acesso) {
        this.acesso = acesso;
    }

    @Override
    public String toString() {
        return "Gerente" + "\n" +
                "Nome: " + this.getNome() + "\n" +
                "CPF: " + this.getCpf() + "\n" +
                "Idade: " + this.getIdade() + "\n" +
                "Salário: " + this.getSalario() + "\n" +
                "Acesso: " + acesso + "\n";
    }
}
