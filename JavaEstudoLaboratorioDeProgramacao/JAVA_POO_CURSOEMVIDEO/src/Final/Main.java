package Final;

public class Main {
	public static void main(String[] args) {
		Video v[] = new Video[3];
		v[0] = new Video("Aula 1 de POO");
		v[1] = new Video("Aula 12 de PHP");
		v[2] = new Video("Aula 10 de HTML5");
		Login login = new Login("jack", 123, true);
		Gafanhoto gafanhato = new Gafanhoto("Davi", 20, "M", login);
		Visualizacao vis[] = new Visualizacao[10];
		vis[0] = new Visualizacao(gafanhato, v[0]);
		vis[1] = new Visualizacao(gafanhato, v[2]);
		vis[2] = new Visualizacao(gafanhato, v[1]);
		vis[3] = new Visualizacao(gafanhato, v[2]);
		vis[4] = new Visualizacao(gafanhato, v[1]);
		vis[5] = new Visualizacao(gafanhato, v[2]);
		vis[6] = new Visualizacao(gafanhato, v[2]);
		vis[7] = new Visualizacao(gafanhato, v[2]);
		vis[8] = new Visualizacao(gafanhato, v[2]);
		vis[9] = new Visualizacao(gafanhato, v[2]);
		System.out.println(v[0].toString());
		vis[0].avaliar();
		vis[0].avaliar();
		System.out.println(v[0].toString());
	}
}
