import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Sistema{
	public void main(Strin[] args){
		// definindo
		Scanner teclado = new Scanner(System.in);
		ArrayList<CartaoCredito> lst_cartao = new ArrayList<CartaoCredito>();
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		String numero = "";
		String titular = "";
		String banco = "";
		int codi_seg;

		//processamento

		System.out.print("digite o número do cartão, digite XXX para finalizar o programa: ");
		numero = teclado.nextLine();

		while(!(numero.equals("XXX"))){

		System.out.print("digite o titular do cartão: ");
		titular = teclado.nextLine();

		System.out.print("digite o banco do cartão: ");
		banco = teclado.nextLine();

		System.out.print("digite o código de segurança do cartão (100 a 999): ");
		codi_seg = teclado.nextInt();

		System.out.print("digite a data de emissão do cartão, no modelo dd/mm/aaaa: ");
		LocalDate emissao = LocalDate.parse(scanner.nextLine(), formato);

		System.out.print("digite a data de validade do cartão, no modelo dd/mm/aaaa: ");
		LocalDate validade = LocalDate.parse(scanner.nextLine(), formato);

		CartaoCredito cartao = new CartaoCredito(numero, titular, banco, codi_seg, emissao, validade);
		lst_cartao.add(cartao);

		System.out.print("digite o número do cartão, digite XXX para finalizar o programa: ");
		numero = teclado.nextLine();

		}//while

	}//main
}//class