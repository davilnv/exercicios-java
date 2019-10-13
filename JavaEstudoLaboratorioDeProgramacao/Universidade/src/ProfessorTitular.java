public class ProfessorTitular extends Professor {
    private int experiencia;
    private int publicacoes;

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getPublicacoes() {
        return publicacoes;
    }

    public void setPublicacoes(int publicacoes) {
        this.publicacoes = publicacoes;
    }

    @Override
    public String toString() {
        return "Professor Titular" + "\n" +
                "Nome: " + this.getNome() + "\n" +
                "CPF: " + this.getCpf() + "\n" +
                "Email: " + this.getEmail() + "\n" +
                "Endereço: " + this.getEndereco() + "\n" +
                "Salário: " + this.getSalario() + "\n" +
                "Siape: " + this.getSiape() + "\n" +
                "Tempo de Experiência: " + experiencia + "\n" +
                "Quantidade de Publicações: " + publicacoes + "\n";

    }
}
