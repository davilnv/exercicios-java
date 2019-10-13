package Aula_06;

public class Lutador{
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura, peso;
	private String categoria;
	private int vitorias, derrotas, empates;
	
	public Lutador(String n, String na, int i, float a, float p, int v, int d, int e) {
		this.nome = n;
		this.nacionalidade = na;
		this.idade = i;
		this.altura = a;
		this.setPeso(p);
		this.vitorias = v;
		this.derrotas = d;
		this.empates = e;
	}
	
	public void apresentar() {
		System.out.println("-----------------------------------------------------");
		System.out.println("Itttssssss TIME! Apresentando o lutador " + this.getNome());
		System.out.println("Diretamente de " + this.getNacionalidade());
		System.out.print("Com " + this.getIdade() +  " anos");
		System.out.println(" e " + this.getAltura() + " metros de altura");
		System.out.println("Pesando " + this.getPeso() + " kg");
		System.out.println("Ganhou " + this.getVitorias() + " vezes");
		System.out.println("Perdeu " + this.getDerrotas() + " vezes");
		System.out.println("Empatou " + this.getEmpates() + " vezes");
	}

	public void status() {
		System.out.println(this.getNome());
		System.out.println("É um peso " + this.getCategoria());
		System.out.println(this.getVitorias() + " vitórias");
		System.out.println(this.getDerrotas() + " derrotas");
		System.out.println(this.getEmpates() + " empates");
	}

	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
	}

	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
	}

	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNacionalidade() {
		return this.nacionalidade;
	}
	public void setNacionalidade(String nacio) {
		this.nacionalidade = nacio;
	}
	public int getIdade() {
		return this.idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getAltura() {
		return this.altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return this.peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}
	public String getCategoria() {
		return this.categoria;
	}
	private void setCategoria() {
		if (this.peso < 52.2f) {
			this.categoria = "Invalido";
		} else if (this.peso <= 70.3) {
			this.categoria = "Leve";
		} else if (this.peso <= 83.9f) {
			this.categoria = "Medio";
		} else if (this.peso <= 120.2f) {
			this.categoria = "Pesado";
		} else {
			this.categoria = "Invalido";
		}
	}
	public int getVitorias() {
		return this.vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	public int getDerrotas() {
		return this.derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public int getEmpates() {
		return this.empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}
}
