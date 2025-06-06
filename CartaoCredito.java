// Atributos: número (número do cartão), titular (nome do dono do cartão), banco (nome do banco),
// código de segurança (entre 100 e 999), LocalDate de emissão, LocalDate de validade.
// Métodos:
// • constructor CartaoCredito(<tipo> numero, <tipo> titular, <tipo> banco, <tipo> codi_seg,
// <tipo> validade): o programador deve avaliar e definir os tipos.
// • public double isValid(<tipo> LocalDate): O programador deve avaliar e definir o tipo.
// Retorna o valor true (verdadeiro) se o valor de LocalDate é maior ou igual a LocalDate de emissão, e
// menor ou igual a LocalDate de validade. Retorna false (falso) caso contrário.
// • public String toString(): retorna uma string com os nomes de todos os atributos seguidos
// dos seus respectivos valores.

public class CartaoCredito{
	int numero;
	String titular;
	String banco;
	int codi_seg;
	LocalDate emissao;
	LocalDate validade;

	CartaoCredito(int numero, String titular, String banco, int codi_seg, LocalDate validade){
		this.numero = numero;
		this.titular = titular;
		this.banco = banco;
		this.codi_seg = codi_seg;
		this.validade = validade;
	}

	public boolean isValid(LocalDate data){
		if data > 

	}


}