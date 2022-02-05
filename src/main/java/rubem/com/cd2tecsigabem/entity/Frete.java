package rubem.com.cd2tecsigabem.entity;

import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import io.swagger.v3.oas.annotations.media.Schema;


import java.time.LocalDateTime;


@Data
@Entity
@Table(name = "tb_frete")
public class Frete {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    
	@NotBlank(message = "O atributo Usuário é Obrigatório!")
    private String nomeDestinatario;
	

	@NotNull(message = "O atributo peso é Obrigatório!")
    private int peso;
	
    @Schema(example = "Digite somente números, sem pontos ou traços")
	@NotBlank(message = "O atributo Usuário é Obrigatório!")
    private String cepOrigem;
    
    @Schema(example = "Digite somente números, sem pontos ou traços")
	@NotBlank(message = "O atributo Usuário é Obrigatório!")
    private String cepDestino;
    
	
    private LocalDateTime dataPrevistaEntrega;
	
    
    private LocalDateTime dataConsulta;
    
    
    @Column(length = 65535, columnDefinition = "text")
    private Double vlTotalFrete;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomeDestinatario() {
		return nomeDestinatario;
	}
	public void setNomeDestinatario(String nomeDestinatario) {
		this.nomeDestinatario = nomeDestinatario;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
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
	public LocalDateTime  getDataPrevistaEntrega() {
		return dataPrevistaEntrega;
	}
	public void setDataPrevistaEntrega(LocalDateTime localDateTime) {
		this.dataPrevistaEntrega = localDateTime;
	}
	public LocalDateTime  getDataConsulta() {
		return dataConsulta;
	}
	public void setDataConsulta(LocalDateTime localDateTime) {
		this.dataConsulta = localDateTime;
	}
	public Double getVlTotalFrete() {
		return vlTotalFrete;
	}
	public void setVlTotalFrete(Double vlTotalFrete) {
		this.vlTotalFrete = vlTotalFrete;
	}

}
