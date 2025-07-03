// Andriy Gabriel e Thiago de Aguiar da Silva

import java.util.HashMap;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Sistema{
    public static void main(String[] args){
        String nome; 
        String simbolo;
        int num_atomico;
        double num_massa;
        int massa_atom;
        String formula;
        Double soma = 0.0;
        String ndeatom;
        String atomo;
        int quantatomos;

        Scanner teclado = new Scanner(System.in);
        HashMap<String, ElementoQuimico> elementos = new HashMap<String, ElementoQuimico>();

        BufferedReader reader;
        try {
            FileReader arq = new FileReader("bdtabperiodica.txt");
            reader = new BufferedReader(arq);
            String line;
            while ((line = reader.readLine()) != null) {
                String[] info = line.split(",");
                nome = info[0].trim();
                simbolo = info[1].trim();
                num_atomico = Integer.parseInt(info[2].trim());
                num_massa = Double.parseDouble(info[3].trim());
                massa_atom = Integer.parseInt(info[4].trim());
                ElementoQuimico quimic = new ElementoQuimico(nome, simbolo, num_atomico, num_massa, massa_atom);
                elementos.put(quimic.simbolo, quimic);
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("---------Fase de consulta---------");
        System.out.print("Digite a fórmula que quer pesquisar: ");
        formula = teclado.nextLine();
        while(!formula.equals("sair")){
            String[] formulaseparada = formula.split("\\.");
            System.out.println(formula.replaceAll("\\.", "") + ":");
            for(int i = 0; i < formulaseparada.length; i++){
                ndeatom = formulaseparada[i].replaceAll("[^0-9]", ""); // numero de atomos
                quantatomos = ndeatom.equals("") ? 1 : Integer.parseInt(ndeatom); // passando o numero de atomos para int, caso não tenha nada o valor será 1
                atomo = formulaseparada[i].replaceAll("[0-9]", "");
                soma = soma + elementos.get(atomo).num_massa * quantatomos; // fazendo a soma da massa molar
                System.out.println(elementos.get(atomo)); 
            }
            System.out.println("Massa molar da substância +/-= " + soma + "g/mol");
            System.out.println(".........................................................");
            System.out.print("Digite a fórmula que quer pesquisar: ");
            formula = teclado.nextLine();
            soma = 0.0; // zerando a variavel soma para entrar no for de novo
        }
        
        teclado.close();





    }//main
}//class