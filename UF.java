public class UF{
	public String nome;
	public String sigla;
	public String regiao;

	public UF(String nome, String sigla, String regiao){
		this.nome = nome;
		this.sigla = sigla;
		this.regiao = regiao;
	}

	public String toString(){
		return "Nome: " + nome + "\n" +
				"Sigla: " + sigla + "\n" +
				"Região: " + regiao + "\n";
	}


}//class