import com.sun.xml.internal.fastinfoset.util.QualifiedNameArray;

public class ProfessorSubstituto extends Professor {
    private int quantidadeRenovacoes;
    private int identificadorContratual;

    public int getQuantidadeRenovacoes() {
        return quantidadeRenovacoes;
    }

    public void setQuantidadeRenovacoes(int quantidadeRenovacoes) {
        this.quantidadeRenovacoes = quantidadeRenovacoes;
    }

    public int getIdentificadorContratual() {
        return identificadorContratual;
    }

    public void setIdentificadorContratual(int identificadorContratual) {
        this.identificadorContratual = identificadorContratual;
    }
    @Override
    public String toString() {
        return "Professor Substituto" + "\n" +
                "Nome: " + this.getNome() + "\n" +
                "CPF: " + this.getCpf() + "\n" +
                "Email: " + this.getEmail() + "\n" +
                "Endereço: " + this.getEndereco() + "\n" +
                "Salário: " + this.getSalario() + "\n" +
                "Siape: " + this.getSiape() + "\n" +
                "Quantidade de Renovações: " + quantidadeRenovacoes + "\n" +
                "Identificador contratual: " + identificadorContratual +"\n";

    }
}
