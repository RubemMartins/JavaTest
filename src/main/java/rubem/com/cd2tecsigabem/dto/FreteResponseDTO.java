package rubem.com.cd2tecsigabem.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;
import lombok.NoArgsConstructor;
import rubem.com.cd2tecsigabem.entity.Frete;

import javax.persistence.Column;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class FreteResponseDTO {

    private Long id;
    private String cepOrigem;
    private String cepDestino;
    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public LocalDateTime getDataPrevistaEntrega() {
		return dataPrevistaEntrega;
	}

	public void setDataPrevistaEntrega(LocalDateTime dataPrevistaEntrega) {
		this.dataPrevistaEntrega = dataPrevistaEntrega;
	}

	public Double getVlTotalFrete() {
		return vlTotalFrete;
	}

	public void setVlTotalFrete(Double vlTotalFrete) {
		this.vlTotalFrete = vlTotalFrete;
	}

	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm:ss")
    private LocalDateTime dataPrevistaEntrega;
    private Double vlTotalFrete;

    public FreteResponseDTO(Frete entity) {
        id = entity.getId();
        cepOrigem = entity.getCepOrigem();
        cepDestino = entity.getCepDestino();
        vlTotalFrete = entity.getVlTotalFrete();
        dataPrevistaEntrega = entity.getDataPrevistaEntrega();
    }
}
