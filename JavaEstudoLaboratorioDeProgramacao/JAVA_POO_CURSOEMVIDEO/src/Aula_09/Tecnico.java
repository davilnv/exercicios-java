package Aula_09;

public abstract class Tecnico extends Aluno{
	private int registroProfissional;
	
	public Tecnico(String n, int i, String s, int ma, String c, int re) {
		super(n, i, s, ma, c);
		this.registroProfissional = re;
	}
	
	public final void praticar() {
		System.out.println("Praticando!");
	}

	public int getRegistroProfissional() {
		return registroProfissional;
	}

	public void setRegistroProfissional(int registroProfissional) {
		this.registroProfissional = registroProfissional;
	}
	
}
