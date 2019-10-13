package exercicio2;

public class TV extends Eletronico{
	private int polegada;
	private String tipo;
	private int canal;
	private int volume;

	public TV(int consumo, int volt) {
		super(consumo, volt);
		this.volume = 30;
	}
	
	public void aumentarVolume() {
		this.volume += 1;
	}
	
	public void diminuirVolume() {
		this.volume -= 1;
	}
	
	public void subirCanal() {
		this.canal += 1;
	}
	
	public void baixarCanal() {
		this.canal -= 1;
	}
	
	public void escolherCanal(int canal) {
		this.canal = canal;
	}

	@Override
	public void ligar() {
		if (this.status == false) {
			this.status = true;
			this.canal = 12;
		}
	}

	@Override
	public void desligar() {
		if (this.status == true) {
			this.status = false;
		}
	}

}
