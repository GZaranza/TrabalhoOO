package pacote;

public class Usuario {

	private String nome;
	private String email;
	private int CPF;
	private String dt_nasc; //"dd/MM/yyyy";
	private int telefone;
	private Endereco endereco;
	
	public Usuario(String nome, String email, int cPF, String dt_nasc, int telefone, Endereco endereco) {
		super();
		this.nome = nome;
		this.email = email;
		CPF = cPF;
		this.dt_nasc = dt_nasc;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCPF() {
		return CPF;
	}

	public void setCPF(int cPF) {
		CPF = cPF;
	}

	public String getDt_nasc() {
		return dt_nasc;
	}

	public void setDt_nasc(String dt_nasc) {
		this.dt_nasc = dt_nasc;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
}
