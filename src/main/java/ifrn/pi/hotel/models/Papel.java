package ifrn.pi.hotel.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.security.core.GrantedAuthority;

@Entity
public class Papel implements GrantedAuthority {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IdPapel;
	private String nome;
	
	public Long getIdPapel() {
		return IdPapel;
	}
	public void setIdPapel(Long idPapel) {
		IdPapel = idPapel;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
