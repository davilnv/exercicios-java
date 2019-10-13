package Aula_06;

import java.util.Random;

public class Luta {
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;
	
	public void marcarLuta(Lutador lutador1, Lutador lutador2) {
		if (lutador1.getCategoria() == lutador2.getCategoria() && lutador1 != lutador2) {
			this.aprovada = true;
			this.desafiado = lutador1;
			this.desafiante = lutador2;
		} else {
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;
		}
	}
	
	public void lutar() {
		if (this.aprovada) {
			System.out.println("### DESAFIADO ###");
			this.desafiado.apresentar();
			System.out.println("### DESAFIANTE ###");
			this.desafiante.apresentar();
			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3); // 0, 1 ou 2
			switch(vencedor) {
				case 0:
					System.out.println("Empatou!");
					this.desafiado.empatarLuta();
					this.desafiante.empatarLuta();
					break;
				case 1:
					System.out.println("O lutador " + this.desafiado.getNome() + " ganhou!");
					this.desafiado.ganharLuta();
					this.desafiante.perderLuta();
					break;
				case 2:
					System.out.println("O lutador " + this.desafiante.getNome() + " ganhou!");
					this.desafiante.ganharLuta();
					this.desafiado.perderLuta();
					break;
			}
		} else {
			System.out.println("Luta não pode acontecer");
		}
	}
	
	public Lutador getDesafiado() {
		return this.desafiado;
	}
	public void setDesafiado(Lutador lutador) {
		this.desafiado = lutador;
	}
	public Lutador getDesafiante() {
		return desafiante;
	}
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	public int getRounds() {
		return rounds;
	}
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	public boolean getAprovada() {
		return aprovada;
	}
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
}
