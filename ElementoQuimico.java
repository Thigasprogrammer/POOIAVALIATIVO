public class ElementoQuimico{
	String nome; 
	String simbolo;
	int num_atomico;
	double num_massa;
	int massa_atom;

	public ElementoQuimico(String nome, String simbolo, int num_atomico, double num_massa, int massa_atom){
		this.nome = nome; 
		this.simbolo = simbolo;
		this.num_atomico = num_atomico;
		this.num_massa = num_massa;
		this.massa_atom = massa_atom;
	}

	public String toString(){
		return nome + ", " + simbolo + ", " + num_atomico + ", " + num_massa + " u, " + massa_atom;
	}
} // class