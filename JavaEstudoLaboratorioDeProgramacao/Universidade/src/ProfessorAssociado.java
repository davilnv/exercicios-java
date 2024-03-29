public class ProfessorAssociado extends Professor {
    private int nivelCategoria;

    public int getNivelCategoria() {
        return nivelCategoria;
    }

    public void setNivelCategoria(int nivelCategoria) {
        this.nivelCategoria = nivelCategoria;
    }
    @Override
    public String toString() {
        return "Professor Associado" + "\n" +
                "Nome: " + this.getNome() + "\n" +
                "CPF: " + this.getCpf() + "\n" +
                "Email: " + this.getEmail() + "\n" +
                "Endereço: " + this.getEndereco() + "\n" +
                "Salário: " + this.getSalario() + "\n" +
                "Siape: " + this.getSiape() + "\n" +
                "Nivel da Categoria: " + nivelCategoria + "\n";

    }
}
