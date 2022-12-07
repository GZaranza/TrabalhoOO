package pacote;

public class Main {
	static Carro celta;
	static Carro gol;
	static Anuncio anuncio1;
	static Anuncio anuncio2;
	static Loja loja;
	static Endereco endereco;
	
	public static void main(String[] args) {
		
		endereco = new Endereco("Rua", "20 sul loja 7", "Aguas Claras", "Brasilia","DF", 71924365);
		System.out.println(endereco.toString());
		
		celta = new Carro("Chevrolet", "Celta", "2015/2016", "Branco", "PAE7474", "4 PORTAS",
				74569);
		//celta.cadastrarCarro();
		gol = new Carro("Volkswagen", "Gol", "2017/2018", "Preto", "PGB4598", "2 portas ",
				35684);
		//gol.cadastrarCarro();
		
		System.out.println(celta.toString());
		System.out.println(gol.toString());
		
		loja= new Loja("Bsb carros", "bsbcarros@hotmail.com","6134756982", endereco,"38154000158","25265874");
		System.out.println(loja.toString());
		
		anuncio1 = new Anuncio(celta, 35000, endereco, "06/12/2022", loja,
				1);
		System.out.println(anuncio1.toString());
		
		
		
	}

}
