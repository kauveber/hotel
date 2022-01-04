package ifrn.pi.hotel.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Quarto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdQuarto;
	
	@NotBlank
	private int numero;
	@NotBlank
	private String tipo;
	@NotBlank
	private String status;
	
	public Long getIdQuarto() {
		return IdQuarto;
	}
	public void setIdQuarto(Long idQuarto) {
		IdQuarto = idQuarto;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
