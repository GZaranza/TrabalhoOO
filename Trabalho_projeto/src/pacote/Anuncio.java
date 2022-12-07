package pacote;



public class Anuncio {
	
	private Carro carro;
	private int valor;
	private Endereco local_venda;
	private String dt_anuncio; //"dd/MM/yyyy"
	private Loja loja;
	private int id_anuncio;
	
	public Anuncio(Carro carro, int valor, Endereco local_venda, String dt_anuncio, Loja loja,
			int id_anuncio) {
		
		this.carro = carro;
		this.valor = valor;
		this.local_venda = local_venda;
		this.dt_anuncio = dt_anuncio;
		this.loja = loja;
		this.id_anuncio = id_anuncio;
	}
	
	

	public String toString() {
		return "*********Anuncio 1************\n"+"Numero do anuncio: "+id_anuncio+"\nCarro: "+carro+"\nValor: "+valor+"\nLoja: "+loja.getNome()+"\nEndereco: "+local_venda.toString()+"\nData da venda: "+dt_anuncio;
	}
	
	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Endereco getLocal_venda() {
		return local_venda;
	}

	public void setLocal_venda(Endereco local_venda) {
		this.local_venda = local_venda;
	}

	public String getDt_anuncio() {
		return dt_anuncio;
	}

	public void setDt_anuncio(String dt_anuncio) {
		this.dt_anuncio = dt_anuncio;
	}

	public Loja getLoja() {
		return loja;
	}

	public void setLoja(Loja loja) {
		this.loja = loja;
	}

	public int getId_anuncio() {
		return id_anuncio;
	}

	public void setId_anuncio(int id_anuncio) {
		this.id_anuncio = id_anuncio;
	}
	
	
	
}
