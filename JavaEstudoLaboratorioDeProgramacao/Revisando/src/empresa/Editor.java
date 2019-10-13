package empresa;

public class Editor extends Funcionario{
	
	@Override
	public void trabalhar() {
		System.out.println("Estou trabalhando como Editor!");
		this.editarVideo();
	}
	
	public void editarVideo() {
		System.out.println("Editando vídeos...");
	}
}
