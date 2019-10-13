package biblioteca;

import java.util.Scanner;

public class Usuario {
	private String nome;
	private String acesso;
	private String cpf;
	
	public void finalizar() {
		System.out.println("Usuário " + this.getNome() + " cadastrado com sucesso!");
	}
	
	public Scanner teclado() {
		Scanner teclado = new Scanner(System.in);
		return teclado;
	}
	
	public void cadastrar() {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Nome: ");
		String nome = teclado.nextLine();
		System.out.print("Acesso: ");
		String acesso = teclado.nextLine();
		System.out.print("CPF do Usuario: ");
		String cpf = teclado.nextLine();
		this.setNome(nome);
		this.setAcesso(acesso);
		this.setCpf(cpf);
		teclado.close();
	}
	
	public void cadastrar(Professor professor) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("-- Cadastro de Usuário Professor --");
		//professor.cadastrar();
		System.out.print("Nome: ");
		String nome = teclado.nextLine();
		System.out.print("Acesso: ");
		String acesso = teclado.nextLine();
		System.out.print("CPF do Usuario: ");
		String cpf = teclado.nextLine();
		System.out.print("SIAPE do Professor: ");
		int siape = teclado.nextInt();
		professor.setNome(nome);
		professor.setAcesso(acesso);
		professor.setCpf(cpf);
		professor.setSiape(siape);
		professor.finalizar();
		teclado.close();
	}
	
	public void cadastrar(Aluno aluno) {
		System.out.println("-- Cadastro de Usuário Aluno --");
		aluno.cadastrar();
		System.out.print("Número da Matrícula do aluno: ");
		int matricula = this.teclado().nextInt();
		aluno.setMatricula(matricula);
		aluno.finalizar();
	}
	
	public void cadastrar(ServidorAdministrativo servidor) {
		System.out.println("## Cadastro de Servidor Administrativo ##");
		servidor.cadastrar();
		System.out.print("Cargo: ");
		String cargo = this.teclado().nextLine();
		servidor.setCargo(cargo);
		servidor.finalizar();
	}
	
	public void fazerEmprestimo() {
		
	}
	
	public void devolverLivro() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAcesso() {
		return acesso;
	}

	public void setAcesso(String acesso) {
		this.acesso = acesso;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}
