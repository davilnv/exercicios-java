public class Professor {
    public String nome;
    private String cpf;
    protected String email;
    private String endereco;
    private float salario;
    private String siape;

    public void registrar(Professor professor) {
        Professor professor1 = new Professor();
        professor1.setNome(professor.getNome());
        professor1.setCpf(professor.getCpf());
        professor1.setEmail(professor.getEmail());
        professor1.setEndereco(professor.getEndereco());
        professor1.setSalario(professor.getSalario());
        professor1.setSiape(professor.getSiape());
        System.out.println("Professor " + professor.getNome() + " cadastrado com sucesso");
    }

    public void registrar(ProfessorAdjunto professorAdjunto) {
        ProfessorAdjunto professorAdjunto1 = new ProfessorAdjunto();
        professorAdjunto1.setNome(professorAdjunto.getNome());
        professorAdjunto1.setCpf(professorAdjunto.getCpf());
        professorAdjunto1.setEmail(professorAdjunto.getEmail());
        professorAdjunto1.setEndereco(professorAdjunto.getEndereco());
        professorAdjunto1.setSalario(professorAdjunto.getSalario());
        professorAdjunto1.setSiape(professorAdjunto.getSiape());
        professorAdjunto1.setNivelCategoria(professorAdjunto.getNivelCategoria());
        System.out.println(professorAdjunto.getNome() + " cadastrado como Professor Adjunto");
    }

    public void registrar(ProfessorAssociado professorAssociado) {
        ProfessorAssociado professorAssociado1 = new ProfessorAssociado();
        professorAssociado1.setNome(professorAssociado.getNome());
        professorAssociado1.setCpf(professorAssociado.getCpf());
        professorAssociado1.setEmail(professorAssociado.getEmail());
        professorAssociado1.setEndereco(professorAssociado.getEndereco());
        professorAssociado1.setSalario(professorAssociado.getSalario());
        professorAssociado1.setSiape(professorAssociado.getSiape());
        professorAssociado1.setNivelCategoria(professorAssociado.getNivelCategoria());
        System.out.println(professorAssociado.getNome() + " cadastrado como Professor Associado");
    }

    public void registrar(ProfessorSubstituto professorSubstituto){
        ProfessorSubstituto professorSubstituto1 = new ProfessorSubstituto();
        professorSubstituto1.setNome(professorSubstituto.getNome());
        professorSubstituto1.setCpf(professorSubstituto.getCpf());
        professorSubstituto1.setEmail(professorSubstituto.getEmail());
        professorSubstituto1.setEndereco(professorSubstituto.getEndereco());
        professorSubstituto1.setSalario(professorSubstituto.getSalario());
        professorSubstituto1.setSiape(professorSubstituto.getSiape());
        professorSubstituto1.setIdentificadorContratual(professorSubstituto.getIdentificadorContratual());
        professorSubstituto1.setQuantidadeRenovacoes(professorSubstituto.getQuantidadeRenovacoes());
        System.out.println(professorSubstituto.getNome() + " cadastrado como Professor Substituto");
    }

    public void registrar(ProfessorTitular professorTitular){
        ProfessorTitular professorTitular1 = new ProfessorTitular();
        professorTitular1.setNome(professorTitular.getNome());
        professorTitular1.setCpf(professorTitular.getCpf());
        professorTitular1.setEmail(professorTitular.getEmail());
        professorTitular1.setEndereco(professorTitular.getEndereco());
        professorTitular1.setSalario(professorTitular.getSalario());
        professorTitular1.setSiape(professorTitular.getSiape());
        professorTitular1.setExperiencia(professorTitular.getExperiencia());
        professorTitular1.setPublicacoes(professorTitular.getPublicacoes());
        System.out.println(professorTitular.getNome() + " cadastrado como Professor Titular");
    }
    public void registrar(ServidorAdministrativo servidorAdministrativo) {
        ServidorAdministrativo servidorAdministrativo1 = new ServidorAdministrativo();
        servidorAdministrativo1.setNome(servidorAdministrativo.getNome());
        servidorAdministrativo1.setCpf(servidorAdministrativo.getCpf());
        servidorAdministrativo1.setEmail(servidorAdministrativo.getEmail());
        servidorAdministrativo1.setEndereco(servidorAdministrativo.getEndereco());
        servidorAdministrativo1.setSalario(servidorAdministrativo.getSalario());
        servidorAdministrativo1.setCargo(servidorAdministrativo.getCargo());
        System.out.println(servidorAdministrativo.getNome() + " cadastrado como Servidor administrativo");
    }

    public void remover(Professor professor) {
        professor.setNome("");
        professor.setCpf("");
        professor.setEmail("");
        professor.setEndereco("");
        professor.setSalario(0);
        professor.setSiape("");
        System.out.println("Professor removido");
    }

    public void remover(ProfessorAdjunto professorAdjunto) {
        professorAdjunto.setNome("");
        professorAdjunto.setCpf("");
        professorAdjunto.setEmail("");
        professorAdjunto.setEndereco("");
        professorAdjunto.setSalario(0);
        professorAdjunto.setSiape("");
        professorAdjunto.setNivelCategoria(0);
        System.out.println("Professor Adjunto removido\n");
    }

    public void remover(ProfessorAssociado professorAssociado) {
        professorAssociado.setNome("");
        professorAssociado.setCpf("");
        professorAssociado.setEmail("");
        professorAssociado.setEndereco("");
        professorAssociado.setSalario(0);
        professorAssociado.setSiape("");
        professorAssociado.setNivelCategoria(0);
        System.out.println("Professor Associado removido\n");
    }

    public void remover(ProfessorSubstituto professorSubstituto) {
        professorSubstituto.setNome("");
        professorSubstituto.setCpf("");
        professorSubstituto.setEmail("");
        professorSubstituto.setEndereco("");
        professorSubstituto.setSalario(0);
        professorSubstituto.setSiape("");
        professorSubstituto.setQuantidadeRenovacoes(0);
        professorSubstituto.setIdentificadorContratual(0);
        System.out.println("Professor Substituto removido\n");
    }

    public void remover(ProfessorTitular professorTitular) {
        professorTitular.setNome(null);
        professorTitular.setCpf(null);
        professorTitular.setEmail(null);
        professorTitular.setEndereco(null);
        professorTitular.setSalario(0);
        professorTitular.setSiape(null);
        professorTitular.setPublicacoes(0);
        professorTitular.setExperiencia(0);
        System.out.println("Professor Titular removido\n");
    }

    public void remover(ServidorAdministrativo servidorAdministrativo) {
        servidorAdministrativo.setNome("");
        servidorAdministrativo.setCpf("");
        servidorAdministrativo.setEmail("");
        servidorAdministrativo.setEndereco("");
        servidorAdministrativo.setSalario(0);
        servidorAdministrativo.setCargo("");
        System.out.println("Servidor Administrativo removido!\n");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getSiape() {
        return siape;
    }

    public void setSiape(String siape) {
        this.siape = siape;
    }

    @Override
    public String toString() {
        return "Professor" + "\n" +
                "Nome: " + nome + "\n" +
                "CPF: " + cpf + "\n" +
                "Email: " + email + "\n" +
                "Endereço: " + endereco + "\n" +
                "Salário: " + salario + "\n" +
                "Siape: " + siape + "\n";
    }

    public static void main(String[] args) {
       Professor professor = new Professor();
       ProfessorTitular professorTitular = new ProfessorTitular();
       professorTitular.setNome("Davi");
       professorTitular.setCpf("12344567890");
       professorTitular.setEmail("davilima871@gmail.com");
       professorTitular.setEndereco("Rua das Flores");
       professorTitular.setSalario(1121.56f);
       professorTitular.setSiape("212131232");
       professorTitular.setExperiencia(3);
       professorTitular.setPublicacoes(2);
       professor.registrar(professorTitular);
       System.out.println(professorTitular.toString());
       professorTitular.remover(professorTitular);
       System.out.println(professorTitular.toString());
    }
}
