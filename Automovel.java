public class Automovel{

	String placa;
	String modelo;
	double peso_fabrica;
	int quantidade_passageiros;
	int quantidade_litros_gasolina;

	public Automovel(String placa, String modelo, double peso, int quantidade_passageiros, int quantidade_litros_gasolina){
		this.placa = placa;
		this.modelo = modelo;
		this.peso_fabrica = peso;
		this.quantidade_passageiros = quantidade_passageiros;
		this.quantidade_litros_gasolina = quantidade_litros_gasolina;
	}

	public double pesoTotal(){
		return peso_fabrica + quantidade_passageiros*75 + quantidade_litros_gasolina*0.75;
	}

	public String toString(){
		return "Placa: " + placa + "\n" +
				"Modelo: " + modelo + "\n" +
				"Peso de fábrica: " +  peso_fabrica + "Kg \n" +
				"Quantidade de passageiros: " + quantidade_passageiros + "\n" +
				"Quantidade de litros de gasolina: " + quantidade_litros_gasolina + "L \n" +
				"Peso total do automóvel, com a gasolina e o número de passageiros: " + pesoTotal() + "Kg \n";
	}

}