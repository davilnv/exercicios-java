package Aula_05;

public class ControleRemoto implements Controlador{
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	public ControleRemoto() {
		this.setVolume(50);
		this.setLigado(false);
		this.setTocando(false);
	}
	public void ligar() {
		this.setLigado(true);
	}
	public void desligar() {
		this.setLigado(false);
	}
	public void abrirMenu() {
		if (this.getLigado()) {
			System.out.println("Está ligado? " + this.getLigado());
			System.out.println("Está tocando " + this.getTocando());
			System.out.print("Volume: " + this.getVolume() + " ");
			for (int i=0; i<=this.getVolume()-1; i+=10) {
				System.out.print("|");
			}
			System.out.println();
		} else {
			System.out.println("Essa TV está desligada");
		}
	}
	public void fecharMenu() {
		if (this.getLigado()) {
			System.out.println("Fechando Menu...");
		} else {
			System.out.println("Essa TV está desligada!");
		}
	}
	public void aumVolume() {
		if (this.getLigado()) {
			this.setVolume(getVolume() + 5);
		} else {
			System.out.println("Essa TV está desligada!");
		}
	}
	public void dimVolume() {
		if(this.getLigado()) {
			this.setVolume(getVolume() - 5);
		} else {
			System.out.println("Essa TV está desligada!");
		}
	}
	public void ligarMudo() {
		if (this.getLigado() && this.getVolume() > 0) {
			this.setVolume(0);
		} else {
			System.out.println("Essa TV está desligada!");
		}
	}
	public void desligarMudo() {
		if (this.getLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		} else {
			System.out.println("Essa TV está desligada!");
		}
	}
	public void play() {
		if (this.getLigado() && !(this.getTocando())) {
			this.setTocando(true);
		} else {
			System.out.println("Essa TV está desligada!");
		}
	}
	public void pause() {
		if (this.getLigado() && this.getTocando()) {
			this.setTocando(false);
		} else {
			System.out.println("Essa TV está desligada!");
		}
	}
	private int getVolume() {
		return this.volume;
	}
	private void setVolume(int volume) {
		this.volume = volume;
	}
	private boolean getLigado(){
		return this.ligado;
	}
	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	private boolean getTocando() {
		return this.tocando;
	}
	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
}
