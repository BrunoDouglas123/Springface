package Teste.com.teste.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "local")
public class Local implements Serializable {
	private static final long serialVersionUID = -6124356736748842698L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nome", length = 90, nullable = false)
	private String nome;
	
	@Column(name = "ramo", length = 90, nullable = false)
	private String ramo;
	
	@Column(name = "proprietario", length = 90, nullable = false)
	private String proprietario;
	
	@JsonIgnore
	@OneToMany(mappedBy = "local")
	private List<Morador> moradores = new ArrayList<>();
	
	public Local() {
	}

	public Local(Long id, String nome, String ramo, String proprietario) {
		this.id = id;
		this.nome = nome;
		this.ramo = ramo;
		this.proprietario = proprietario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRamo() {
		return ramo;
	}

	public void setRamo(String ramo) {
		this.ramo = ramo;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public List<Morador> getMoradores() {
		return moradores;
	}

	@Override
	public String toString() {
		return "Local [id=" + id + ", nome=" + nome + ", ramo=" + ramo + ", proprietario=" + proprietario + "]";
	}
}
