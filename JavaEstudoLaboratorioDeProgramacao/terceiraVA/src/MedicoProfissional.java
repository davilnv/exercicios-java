public class MedicoProfissional extends Medico {
    protected int crm;
    protected String especialidade;

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return "Medico Profissional" + "\n" +
                "Nome: " + nome + "\n" +
                "CPF: " + cpf + "\n" +
                "Telefone:" + telefone + "\n" +
                "Email: " + email + "\n" +
                "Endereco: " + endereco + "\n" +
                "Salário: " + salario + "\n" +
                "CRM: " + crm + "\n" +
                "Especialidade: " + especialidade + "\n";
    }
}
