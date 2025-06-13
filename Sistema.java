import java.util.HashMap;
import java.util.Scanner;

public class Sistema{
	public static void main(String[] args){
		//definindo variaveis
		Scanner teclado = new Scanner(System.in);
		HashMap<String, UF> hmcadastros = new HashMap<>();
		String nome;
		String sigla;
		String regiao;
		String pesquisa;

		System.out.print("Digite o nome da UF, caso deseje sair digite 'sair': ");
		nome = teclado.nextLine();

		while(!(nome.equalsIgnoreCase("sair"))){
			System.out.print("Digite a sigla da UF: ");
			sigla = teclado.nextLine();
			System.out.print("Digite a região da UF: ");
			regiao = teclado.nextLine();
			UF cadastramento = new UF(nome, sigla, regiao);
			hmcadastros.put(sigla, cadastramento);
			System.out.println(); // qubra de linha para ficar estético

			System.out.print("Digite o nome da UF, caso deseje sair digite 'sair': ");
			nome = teclado.nextLine();


		}// while
		System.out.println(); // qubra de linha para ficar estético


		System.out.print("Digite a sigla da UF ou da regiao, que deseja pesquisar, caso deseje sair digite 'sair': ");
		pesquisa = teclado.nextLine();

		while(!(pesquisa.equalsIgnoreCase("sair"))){ // consulta
			if(hmcadastros.containsKey(pesquisa)){ // consulta por uf
				System.out.println(hmcadastros.get(pesquisa).toString());
			}
			else{ //consulta por regiao
				for(UF uf : hmcadastros.values()){
					if((uf.regiao).equalsIgnoreCase(pesquisa)) {
						System.out.println(uf.toString());
					}
				}
			}
			System.out.print("Digite a sigla da UF ou da regiao, que deseja pesquisar, caso deseje sair digite 'sair': ");
			pesquisa = teclado.nextLine();
		}//while2

		System.out.print("\n ----------fim do programa----------");
		teclado.close();

	}//main
}//class