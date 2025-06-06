import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Sistema {
    public static void main(String[] args) {
        //definindo 
        Scanner teclado = new Scanner(System.in);
        ArrayList<CartaoCredito> lst_cartao = new ArrayList<CartaoCredito>();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String numero = "";
        String titular = "";
        String banco = "";
        int codi_seg;
        String status = "";

        //processando

        System.out.print("Digite o número do cartão (ou 'XXX' para encerrar): ");
        numero = teclado.nextLine();

        while (!numero.equals("XXX")) {
            System.out.print("Digite o titular do cartão: ");
            titular = teclado.nextLine();

            System.out.print("Digite o banco do cartão: ");
            banco = teclado.nextLine();

            System.out.print("Digite o código de segurança (100 a 999): ");
            codi_seg = teclado.nextInt();
            while(codi_seg < 100 || codi_seg > 999){
                System.out.print("O código de segurança está fora do intervalo, digite novamente (100 a 999): ");
                codi_seg = teclado.nextInt();
            }
            teclado.nextLine(); // consumir quebra de linha

            System.out.print("Digite a data de emissão (dd/MM/aaaa): ");
            LocalDate emissao = LocalDate.parse(teclado.nextLine(), formato);

            System.out.print("Digite a data de validade (dd/MM/aaaa): ");
            LocalDate validade = LocalDate.parse(teclado.nextLine(), formato);

            CartaoCredito cartao = new CartaoCredito(numero, titular, banco, codi_seg, emissao, validade);
            lst_cartao.add(cartao);

            System.out.print("\nDigite o número do próximo cartão (ou 'XXX' para encerrar): ");
            numero = teclado.nextLine();
        }

        if(lst_cartao.size() != 0){
                System.out.print("\nDigite uma data para verificar os cartões (dd/MM/aaaa): ");
                LocalDate dataConsulta = LocalDate.parse(teclado.nextLine(), formato);
       
                System.out.println("\n--- RESULTADO ---");
                for (CartaoCredito c : lst_cartao) {
                    System.out.println(c.toString());
                    if(c.isValid(dataConsulta) == true){
                    	status = "VÁLIDO";
                    }
                   	else{
                   	    status = "INVÁLIDO";
                    }
                    System.out.println("Status: " + status);
                    System.out.println("------------------------");
                }
        }
        System.out.print("\n-----FIM DO PROGRAMA-----");
        teclado.close();
    }// main
}// class
