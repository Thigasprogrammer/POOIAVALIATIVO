import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {
    	// definindo váriaveis
        String placa;
        String modelo;
        double peso_fabrica;
        int quantidade_passageiros;
        int quantidade_litros_gasolina;
        double maiorpeso = -1; // váriavel usada no for do print, para salvar o peso do automovel mais pesado, definido como -1 para o primeiro peso ja assumir a variavel (afinal não existe peso <0)
        String dadospesado = ""; // váriavel usada no for do print, para salvar os dados do automovel mais pesado, definido como vazio para caso o usuario começar com ZZZZZZZZ não imprimir nada
        Scanner teclado = new Scanner(System.in);
        ArrayList<Automovel> lst_autos = new ArrayList<Automovel>();

        // processamento
        System.out.print("Digite a placa do automóvel, caso deseje finalizar o programa digite ZZZZZZZZ: ");
        placa = teclado.nextLine();

        while (!placa.equals("ZZZZZZZZ")) {

            System.out.print("Digite o modelo do automóvel: ");
            modelo = teclado.nextLine();

            System.out.print("Digite o peso de fábrica do automóvel: ");
            peso_fabrica = Double.parseDouble(teclado.nextLine()); // passando String para double para usar entrada de dados de arquivo externo, evitar o "\n"

            
            System.out.print("Digite a quantidade de passageiros do automóvel: ");
            quantidade_passageiros = Integer.parseInt(teclado.nextLine()); // passando String para inteiro para usar entrada de dados de arquivo externo, evitar o "\n"


            while(quantidade_passageiros < 0 || quantidade_passageiros > 5){
            	System.out.print("Número de passageiros é entre 0 e 5, digite novamente: ");
            	quantidade_passageiros = Integer.parseInt(teclado.nextLine()); // passando String para inteiro para usar entrada de dados de arquivo externo, evitar o "\n"

            }// while verificação1

            System.out.print("Digite a quantidade de litros de gasolina do automóvel: ");
            quantidade_litros_gasolina = Integer.parseInt(teclado.nextLine()); // passando String para inteiro para usar entrada de dados de arquivo externo, evitar o "\n"


            while(quantidade_litros_gasolina < 0|| quantidade_litros_gasolina > 40){
            	System.out.print("Número de litros de gasolina é entre 0L e 40L, digite novamente: ");
            	quantidade_litros_gasolina = Integer.parseInt(teclado.nextLine()); // passando String para inteiro para usar entrada de dados de arquivo externo, evitar o "\n"
            }// while verificação2

            System.out.println(); // quebra de linha para ficar mais facil visualização

            Automovel auto = new Automovel(placa, modelo, peso_fabrica, quantidade_passageiros, quantidade_litros_gasolina); // define auto
            lst_autos.add(auto); // coloca o auto na lista, a cada ocorrencia do while o auto ficara em uma posição da lista

            System.out.print("Digite o número da placa, caso deseje finalizar o programa digite ZZZZZZZZ: ");
            placa = teclado.nextLine();
        }

        System.out.println("\n"); // quebra de linha para ficar mais facil visualização

        for(int i = 0; i < lst_autos.size(); i++){
        	System.out.println(lst_autos.get(i));
        	if(lst_autos.get(i).pesoTotal() > maiorpeso){ // explicação if(peso da variavel Automóvel auto > maiorpeso) na primeira volta do for sempre vai assumir o peso do primeiro auto pois ela começa como -1
        		maiorpeso = lst_autos.get(i).pesoTotal(); // define o maior peso como o peso do novo auto (caso entre no if)
        		dadospesado = lst_autos.get(i).toString(); // salva os dados do auto (que estão no toString) em uma váriavel tipo String, para ser chamada depois
        	}
        }
        System.out.println("------------------DADOS DO AUTOMÓVEL DE MAIOR PESO------------------");
        System.out.print(dadospesado);


        teclado.close();
     
    }
}
