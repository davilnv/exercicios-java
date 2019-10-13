package exercicio2;

public class Radio extends Eletronico {
	public static int AM = 1;
	public static int FM = 2;
	private int banda, volume;
	private float sintonia;
	
	public Radio(int consumo, int volt) {
		super(consumo, volt);
	}

	@Override
	public void ligar() {
		if (this.status == false) {
			this.status = true;
			this.sintonia = 88.1f;
			this.volume = 10;
		}
	}

	@Override
	public void desligar() {
		if (this.status == true) {
			this.status = false;
			this.volume = 0;
		}
	}
	
}
