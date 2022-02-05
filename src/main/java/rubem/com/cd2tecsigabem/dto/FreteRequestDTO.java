package rubem.com.cd2tecsigabem.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import rubem.com.cd2tecsigabem.entity.Frete;

@Data
@NoArgsConstructor
public class FreteRequestDTO {

    private String cepOrigem;
    private String cepDestino;
    private int peso;
    private String nomeDestinatario;
    

    public String getCepOrigem() {
		return cepOrigem;
	}


	public void setCepOrigem(String cepOrigem) {
		this.cepOrigem = cepOrigem;
	}


	public String getCepDestino() {
		return cepDestino;
	}


	public void setCepDestino(String cepDestino) {
		this.cepDestino = cepDestino;
	}


	public int getPeso() {
		return peso;
	}


	public void setPeso(int peso) {
		this.peso = peso;
	}


	public String getNomeDestinatario() {
		return nomeDestinatario;
	}


	public void setNomeDestinatario(String nomeDestinatario) {
		this.nomeDestinatario = nomeDestinatario;
	}


	public FreteRequestDTO() { }
	
	public FreteRequestDTO(Frete entity) {
        cepOrigem = entity.getCepOrigem();
        cepDestino = entity.getCepDestino();
        peso = entity.getPeso();
        nomeDestinatario = entity.getNomeDestinatario();
    }
}
