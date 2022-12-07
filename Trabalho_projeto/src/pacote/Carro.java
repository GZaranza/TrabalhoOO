package pacote;

public class Carro {
	
	private String marca;
	private String modelo;
	private String ano;
	private String cor;
	private String placa;
	private String descricao;
	private int kilometragem;
	private int id_carro;
	
	public Carro(String marca, String modelo, String ano, String cor, String placa, String descricao,
			int kilometragem) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
		this.placa = placa;
		this.descricao = descricao;
		this.kilometragem = kilometragem;
	}

	public void cadastrarCarro() {
		id_carro++;
		setId_carro(id_carro);
		
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getKilometragem() {
		return kilometragem;
	}

	public void setKilometragem(int kilometragem) {
		this.kilometragem = kilometragem;
	}
	
	public String toString() {
		return "**********Carro "+id_carro+"**********\nModelo: "+ modelo+ "\nMarca: "+ marca+ "\nAno: "+ano+ "\nCor: "+cor+ "\nPlaca: "+placa+ "\nDescricao: "+descricao+"\n";
	}

	public int getId_carro() {
		return id_carro;
	}

	public void setId_carro(int id_carro) {
		this.id_carro = id_carro;
	}
	
}
