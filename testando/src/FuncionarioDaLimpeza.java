public class FuncionarioDaLimpeza extends Funcionario {

    @Override
    public String toString() {
        return "Funcionario da Limpeza" + "\n" +
                "Nome: " + this.getNome() + "\n" +
                "CPF: " + this.getCpf() + "\n" +
                "Idade: " + this.getIdade() + "\n" +
                "Salário: " + this.getSalario() + "\n";
    }
}
