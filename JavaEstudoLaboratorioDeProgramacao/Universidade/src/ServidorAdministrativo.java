public class ServidorAdministrativo extends Professor {
    private String cargo;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Assistente Administrativo" + "\n" +
                "Nome: " + this.getNome() + "\n" +
                "CPF: " + this.getCpf() + "\n" +
                "Email: " + this.getEmail() + "\n" +
                "Endereço: " + this.getEndereco() + "\n" +
                "Salário: " + this.getSalario() + "\n" +
                "Siape: " + this.getSiape() + "\n" +
                "Cargo do Assistente: " + cargo + "\n";

    }
}
