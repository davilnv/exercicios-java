public class Funcionario {
    private String nome;
    private String cpf;
    private int idade;
    private float salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String cpf, int idade, float salario) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setIdade(idade);
        this.setSalario(salario);
    }

    public void cadastrar(Funcionario funcionario) {
        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNome(funcionario.getNome());
        funcionario1.setCpf(funcionario.getCpf());
        funcionario1.setIdade(funcionario.getIdade());
        funcionario1.setSalario(funcionario.getSalario());
        System.out.println("Funcionário " + funcionario1.getNome() + " cadastrado com sucesso!");
    }

    public void cadastrar(Gerente gerente) {
        Gerente gerente1 = new Gerente();
        gerente1.setNome(gerente.getNome());
        gerente1.setCpf(gerente.getCpf());
        gerente1.setIdade(gerente.getIdade());
        gerente1.setSalario(gerente.getSalario());
        gerente1.setAcesso(gerente.getAcesso());
        System.out.println("Gerente " + gerente1.getNome() + " cadastrado com sucesso!");
    }

    public void cadastrar(FuncionarioDaLimpeza funcionario) {
        FuncionarioDaLimpeza funcionario1 = new FuncionarioDaLimpeza();
        funcionario1.setNome(funcionario.getNome());
        funcionario1.setCpf(funcionario.getCpf());
        funcionario1.setIdade(funcionario.getIdade());
        funcionario1.setSalario(funcionario.getSalario());
        System.out.println("Funcionário da Limpeza" + funcionario1.getNome() + " cadastrado com sucesso!");
    }

    public void cadastrar(OperadorDeCaixa operador) {
        OperadorDeCaixa operador1 = new OperadorDeCaixa();
        operador1.setNome(operador.getNome());
        operador1.setCpf(operador.getCpf());
        operador1.setIdade(operador.getIdade());
        operador1.setSalario(operador.getSalario());
        operador1.setRegistroFinanceiro(operador.getRegistroFinanceiro());
        System.out.println("Operador de caixa " + operador1.getNome() + " cadastrado com sucesso!");
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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario" + "\n" +
                "Nome: " + nome + "\n" +
                "CPF: " + cpf + "\n" +
                "Idade: " + idade + "\n" +
                "Salário: " + salario + "\n";
    }
}
