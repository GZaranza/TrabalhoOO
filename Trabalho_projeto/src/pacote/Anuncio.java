package pacote;

public class Anuncio {
	
	private Carro produto;
	private int valor;
	private Endereco local_venda;
	private String dt_anuncio; //"dd/MM/yyyy"
	private Usuario anunciante;
	private int id_anuncio;
	
	public Anuncio(Carro produto, int valor, Endereco local_venda, String dt_anuncio, Usuario anunciante,
			int id_anuncio) {
		super();
		this.produto = produto;
		this.valor = valor;
		this.local_venda = local_venda;
		this.dt_anuncio = dt_anuncio;
		this.anunciante = anunciante;
		this.id_anuncio = id_anuncio;
	}

	public Carro getProduto() {
		return produto;
	}

	public void setProduto(Carro produto) {
		this.produto = produto;
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

	public Usuario getAnunciante() {
		return anunciante;
	}

	public void setAnunciante(Usuario anunciante) {
		this.anunciante = anunciante;
	}

	public int getId_anuncio() {
		return id_anuncio;
	}

	public void setId_anuncio(int id_anuncio) {
		this.id_anuncio = id_anuncio;
	}
	
	
	
}
