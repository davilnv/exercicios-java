public class MedicoResidente extends Medico {
    protected String especialidade;
    protected String vinculoUniversidade;
    protected String setorDoHopital;

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getVinculoUniversidade() {
        return vinculoUniversidade;
    }

    public void setVinculoUniversidade(String vinculoUniversidade) {
        this.vinculoUniversidade = vinculoUniversidade;
    }

    public String getSetorDoHopital() {
        return setorDoHopital;
    }

    public void setSetorDoHopital(String setorDoHopital) {
        this.setorDoHopital = setorDoHopital;
    }

    @Override
    public String toString() {
        return "Medico Residente" + "\n" +
                "Nome: " + nome + "\n" +
                "CPF: " + cpf + "\n" +
                "Telefone:" + telefone + "\n" +
                "Email: " + email + "\n" +
                "Endereco: " + endereco + "\n" +
                "Salário: " + salario + "\n" +
                "Especialidade: " + especialidade + '\'' +
                "Vinculo da Universidade: " + vinculoUniversidade + '\'' +
                "Setor do Hopital: " + setorDoHopital + "\n";
    }
}
