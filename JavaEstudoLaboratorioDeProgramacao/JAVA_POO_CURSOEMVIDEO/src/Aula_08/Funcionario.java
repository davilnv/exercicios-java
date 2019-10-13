package Aula_08;

import Aula_07.Pessoa;

public class Funcionario extends Pessoa{
	private String setor;
	private boolean trabalhando;
	
	public Funcionario(String n, int i, String s, String se, boolean tra) {
		super(n, i, s);
		this.setSetor(se);
		this.setTrabalhando(false);
	}
	
	public void mudarTrabalho() {
		this.trabalhando = ! this.trabalhando;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public boolean getTrabalhando() {
		return trabalhando;
	}

	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}
	
	
}
