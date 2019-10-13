public class Medico {
	protected String nome;
	protected String telefone;
	protected String email;
	
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void registrar(Medico medico) {
		 Medico medico1 = new Medico();
		 medico1.setNome(medico.getNome());
		 medico1.setEmail(medico.getEmail());
		 medico1.setTelefone(medico.getTelefone());
		 System.out.println("Salvo!");
	}
	public void registrar(MedicoHospital medicohospital) {
		MedicoHospital medicohospital1 = new MedicoHospital();
		medicohospital1.setNome(medicohospital.getNome());
		medicohospital1.setEmail(medicohospital.getEmail());
		medicohospital1.setTelefone(medicohospital.getTelefone());
		System.out.println("Salvo!");
	}
	public void registrar(ClinicoGeral clinicogeral) {
		ClinicoGeral clinicogeral1 = new ClinicoGeral();
		clinicogeral1.setNome(clinicogeral.getNome());
		clinicogeral1.setEmail(clinicogeral.getEmail());
		clinicogeral1.setTelefone(clinicogeral.getTelefone());
		System.out.println("Salvo!");
	}
	public void remover(Medico medico) {
		medico.setNome("");
		medico.setEmail("");
		medico.setTelefone("");
		System.out.println("Removido!");
	}
	public void remover(MedicoHospital medicohospital) {
		medicohospital.setNome("");
		medicohospital.setEmail("");
		medicohospital.setTelefone("");
		medicohospital.setNumeroDoEquipe(0);
		medicohospital.setNumeroDoPage(0);
		System.out.println("Removido");
	}
	public void remover(ClinicoGeral clinicogeral) {
		clinicogeral.setNome("");
		clinicogeral.setEmail("");
		clinicogeral.setTelefone("");
		clinicogeral.setEndereco("");
		clinicogeral.setExperiencia("");
		System.out.println("Removido");
	}
	public void registro(Medico medico) {
		Medico medico1 = new Medico();
		medico1.getNome();
		medico1.getEmail();
		medico1.getTelefone();
		System.out.println("Mostrar Registro");
	}
	public static void main(String[] args) {
		Medico medico = new Medico();
		MedicoHospital medicohospital = new MedicoHospital();
		medicohospital.setNome("Davi Lima");
		medicohospital.setEmail("davilima871@gmail.com");
		medicohospital.setTelefone("81818181188118");
		medico.registrar(medicohospital);
		System.out.println(medicohospital.getNome());		
		medico.remover(medicohospital);
	}
}
