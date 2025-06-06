import java.time.LocalDate;

public class CartaoCredito {
    String numero;
    String titular;
    String banco;
    int codi_seg;
    LocalDate emissao;
    LocalDate validade;

    public CartaoCredito(String numero, String titular, String banco, int codi_seg, LocalDate emissao, LocalDate validade) {
        this.numero = numero;
        this.titular = titular;
        this.banco = banco;
        this.codi_seg = codi_seg;
        this.emissao = emissao;
        this.validade = validade;
    }

	public boolean isValid(LocalDate data) {
		boolean verificar;
	    if ((data.isEqual(emissao) || data.isAfter(emissao)) && (data.isEqual(validade) || data.isBefore(validade))) {
	        verificar = true;
	    } 
	    else {
	        verificar = false;
	    }

	    return verificar;
	}

    public String toString() {
        return "Número: " + numero +
               "\nTitular: " + titular +
               "\nBanco: " + banco +
               "\nCódigo de Segurança: " + codi_seg +
               "\nData de Emissão: " + emissao +
               "\nData de Validade: " + validade;
    }
}

