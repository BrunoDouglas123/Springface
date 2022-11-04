package Teste.com.teste.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "morador ")
public class Morador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nome", length = 90, nullable = false)
	private String nome;
	
	@Column(name = "ocupacao", length = 90, nullable = false)
	private String ocupacao;
	
	@Column(name = "parente", length = 90, nullable = false)
	private String parente;
	
	@Column(name = "idade", length = 20, nullable = false)
	private int idade;
	
	@Column(name = "pena", length = 20, nullable = false)
	private int pena;
	
	public Morador() {		
	}

	public Morador(Long id, String nome, String ocupacao,
			String parente, int idade, int pena) {
		this.id = id;
		this.nome = nome;
		this.ocupacao = ocupacao;
		this.parente = parente;
		this.idade = idade;
		this.pena = pena;
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

	public String getOcupacao() {
		return ocupacao;
	}

	public void setOcupacao(String ocupacao) {
		this.ocupacao = ocupacao;
	}

	public String getParente() {
		return parente;
	}

	public void setParente(String parente) {
		this.parente = parente;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getPena() {
		return pena;
	}

	public void setPena(int pena) {
		this.pena = pena;
	}

	@Override
	public String toString() {
		return "Morador [id=" + id + ", nome=" + nome + ", ocupacao=" + ocupacao + ", parente=" + parente + ", idade="
				+ idade + ", pena=" + pena + "]";
	}
}
