public class Medico {
    protected String nome;
    protected String cpf;
    protected int telefone;
    protected String email;
    protected String endereco;
    protected float salario;


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

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
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

    public void registrar(Medico medico) {
        Medico medico1 = new Medico();
        medico1.setNome(medico.getNome());
        medico1.setCpf(medico.getCpf());
        medico1.setTelefone(medico.getTelefone());
        medico1.setEmail(medico.getEmail());
        medico1.setEndereco(medico.getEndereco());
        medico1.setSalario(medico.getSalario());
        System.out.println("Medico registrado com sucesso!");
    }

    public void registrar(MedicoProfissional medicoProfissional) {
        MedicoProfissional medicoProfissional1 = new MedicoProfissional();
        medicoProfissional1.setNome(medicoProfissional.getNome());
        medicoProfissional1.setCpf(medicoProfissional.getCpf());
        medicoProfissional1.setTelefone(medicoProfissional.getTelefone());
        medicoProfissional1.setEmail(medicoProfissional.getEmail());
        medicoProfissional1.setEndereco(medicoProfissional.getEndereco());
        medicoProfissional1.setSalario(medicoProfissional.getSalario());
        medicoProfissional1.setCrm(medicoProfissional.getCrm());
        medicoProfissional1.setEspecialidade(medicoProfissional.getEspecialidade());
        System.out.println("Medico Profissional registrado com sucesso!");
    }

    public void registrar(MedicoResidente medicoResidente) {
        MedicoResidente medicoResidente1 = new MedicoResidente();
        medicoResidente1.setNome(medicoResidente.getNome());
        medicoResidente1.setCpf(medicoResidente.getCpf());
        medicoResidente1.setTelefone(medicoResidente.getTelefone());
        medicoResidente1.setEmail(medicoResidente.getEmail());
        medicoResidente1.setEndereco(medicoResidente.getEndereco());
        medicoResidente1.setSalario(medicoResidente.getSalario());
        medicoResidente1.setEspecialidade(medicoResidente.getEspecialidade());
        medicoResidente1.setVinculoUniversidade(medicoResidente.getVinculoUniversidade());
        medicoResidente1.setSetorDoHopital(medicoResidente.getSetorDoHopital());
        System.out.println("Medico Residente registrado com sucesso!");
    }

    public void registrar(MedicoInteno medicoInteno) {
        MedicoInteno medicoInteno1 = new MedicoInteno();
        medicoInteno1.setNome(medicoInteno.getNome());
        medicoInteno1.setCpf(medicoInteno.getCpf());
        medicoInteno1.setTelefone(medicoInteno.getTelefone());
        medicoInteno1.setEmail(medicoInteno.getEmail());
        medicoInteno1.setEndereco(medicoInteno.getEndereco());
        medicoInteno1.setSalario(medicoInteno.getSalario());
        medicoInteno1.setVinculoUniversidade(medicoInteno.getVinculoUniversidade());
        medicoInteno1.setSetorDoHopital(medicoInteno.getSetorDoHopital());
        medicoInteno1.setIdentificadorDeContrato(medicoInteno.getIdentificadorDeContrato());
        System.out.println("Medico Interno registrado com sucesso!" + "\n");
    }

    public void remover(Medico medico) {
        medico.setNome("");
        medico.setCpf("");
        medico.setTelefone(0);
        medico.setEmail("");
        medico.setEndereco("");
        medico.setSalario(0);
        System.out.println("Medico foi removido!");
    }

    public void remover(MedicoProfissional medicoProfissional) {
        medicoProfissional.setNome("");
        medicoProfissional.setCpf("");
        medicoProfissional.setTelefone(0);
        medicoProfissional.setEmail("");
        medicoProfissional.setEndereco("");
        medicoProfissional.setSalario(0);
        medicoProfissional.setCrm(0);
        medicoProfissional.setEspecialidade("");
        System.out.println("Medico Profissional foi removido!");
    }

    public void remover(MedicoResidente medicoResidente) {
        medicoResidente.setNome("");
        medicoResidente.setCpf("");
        medicoResidente.setTelefone(0);
        medicoResidente.setEmail("");
        medicoResidente.setEndereco("");
        medicoResidente.setSalario(0);
        medicoResidente.setEspecialidade("");
        medicoResidente.setVinculoUniversidade("");
        medicoResidente.setSetorDoHopital("");
        System.out.println("Medico Residente foi removido!");
    }

    public void remover(MedicoInteno medicoInteno) {
        medicoInteno.setNome("");
        medicoInteno.setCpf("");
        medicoInteno.setTelefone(0);
        medicoInteno.setEmail("");
        medicoInteno.setEndereco("");
        medicoInteno.setSalario(0);
        medicoInteno.setVinculoUniversidade("");
        medicoInteno.setSetorDoHopital("");
        medicoInteno.setNomeMedicoResponsavel("");
        medicoInteno.setIdentificadorDeContrato("");
        System.out.println("Medico Interno foi removido!" + "\n");
    }

    @Override
    public String toString() {
        return "Medico" + "\n" +
                "Nome: " + nome + "\n" +
                "CPF: " + cpf + "\n" +
                "Telefone:" + telefone + "\n" +
                "Email: " + email + "\n" +
                "Endereco: " + endereco + "\n" +
                "Salário: " + salario + "\n";
    }

    public static void main(String[] args) {
        Medico medico = new Medico();
        MedicoInteno medicoInteno = new MedicoInteno();
        medicoInteno.setNome("Davi");
        medicoInteno.setCpf("1211321321312");
        medicoInteno.setEmail("davilima871@gmail.com");
        medicoInteno.setEndereco("Rua das flores");
        medicoInteno.setTelefone(127162712);
        medicoInteno.setSalario(4.124f);
        medicoInteno.setIdentificadorDeContrato("E12D12132");
        medicoInteno.setVinculoUniversidade("UFRPE");
        medicoInteno.setNomeMedicoResponsavel("Dr. João");
        medicoInteno.setSetorDoHopital("Raio-X");
        medico.registrar(medicoInteno);
        System.out.println(medicoInteno.toString());
        medico.remover(medicoInteno);
        System.out.println(medicoInteno.toString());
    }
}
