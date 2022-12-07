package pacote;


public class Loja extends Conta {

	private String cnpj;
	private String insc_est;
	private Anuncio[] anuncios= new Anuncio[10];
	private int numAnuncios=0;
	private Carro[] carros = new Carro[10];
	
	public Loja(String nome, String email,String telefone,Endereco endereco,String cnpj, String insc_est) {
		this.nome=nome;
		this.email = email;
		this.telefone = telefone;
		this.endereco=endereco;
		this.cnpj = cnpj;
		this.insc_est = insc_est;
		
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInsc_est() {
		return insc_est;
	}

	public void setInsc_est(String insc_est) {
		this.insc_est = insc_est;
	}

	public Anuncio[] getAnuncios() {
		return this.anuncios;
	}

	public void setArrayAnuncios(Anuncio[] anuncios) {
		this.anuncios = anuncios;
	}
	
	

	/*public Anuncio getCarro(int i) {
		return anuncios[i].getCarro();
	}
	
	public void setProduto(Anuncio anunciosFeito, int i) {
		this.anuncios[i] = anunciosFeito;
	}
	*/
	
	
	public String toString() {
		return "Loja 1\n"+"Loja: "+nome+"\nCNPJ: "+cnpj+"\nIE: "+insc_est+"\nEndereco: "+endereco;
	}

	public Carro[] getCarros() {
		return carros;
	}

	public void setCarros(Carro carros, int i) {
		this.carros[i] = carros;
	}
	
		
	
	
	
}
