public class MedicoInteno extends Medico {
    protected String vinculoUniversidade;
    protected String setorDoHopital;
    protected String nomeMedicoResponsavel;
    protected String identificadorDeContrato;

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

    public String getNomeMedicoResponsavel() {
        return nomeMedicoResponsavel;
    }

    public void setNomeMedicoResponsavel(String nomeMedicoResponsavel) {
        this.nomeMedicoResponsavel = nomeMedicoResponsavel;
    }

    public String getIdentificadorDeContrato() {
        return identificadorDeContrato;
    }

    public void setIdentificadorDeContrato(String identificadorDeContrato) {
        this.identificadorDeContrato = identificadorDeContrato;
    }

    @Override
    public String toString() {
        return "Medico Interno"+ "\n" +
                "Nome: " + nome + "\n" +
                "CPF: " + cpf + "\n" +
                "Telefone:" + telefone + "\n" +
                "Email: " + email + "\n" +
                "Endereco: " + endereco + "\n" +
                "Salário: " + salario + "\n" +
                "Vinculo da Universidade: " + vinculoUniversidade + "\n" +
                "Setor do Hopital: " + setorDoHopital + "\n" +
                "Nome do MedicoResponsavel: " + nomeMedicoResponsavel + "\n" +
                "Identificador de Contrato: " + identificadorDeContrato + "\n";
    }
}
