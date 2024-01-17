package com.generation.lojaGames.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "O nome do jogo é obrigatório")
	@Size(min = 2, max = 100, message = "O nome deve conter no mínimo 2 e no máximo 100 caracteres")
	private String nomeJogo;

	@NotNull(message = "Preço é obrigatório")
	private double preco;

	@NotBlank(message = "A descrição do jogo é obrigatória")
	@Size(min = 10, max = 255, message = "A descrição deve conter no mínimo 10 e no máximo 255 caracteres")
	private String descricao;

	@NotBlank(message = "Informar idiomas disponíveis")
	@Size(min = 5, max = 155, message = "Os idiomas disponíveis devem conter no mínimo 5 e no máximo 155 caracteres")
	private String idiomaDisponivel;

	@NotBlank(message = "Informar modo de jogo")
	@Size(min = 5, max = 155, message = "O modo de jogo deve conter no mínimo 5 e no máximo 155 caracteres")
	private String modoDeJogo;

	@NotBlank(message = "Informar data de lançamento")
	@Size(min = 8, max = 10, message = "A data de lançamento deve conter no mínimo 8 e no máximo 10 caracteres")
	private String dataLancamento;
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Genero genero;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeJogo() {
		return nomeJogo;
	}

	public void setNomeJogo(String nomeJogo) {
		this.nomeJogo = nomeJogo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getIdiomaDisponivel() {
		return idiomaDisponivel;
	}

	public void setIdiomaDisponivel(String idiomaDisponivel) {
		this.idiomaDisponivel = idiomaDisponivel;
	}

	public String getModoDeJogo() {
		return modoDeJogo;
	}

	public void setModoDeJogo(String modoDeJogo) {
		this.modoDeJogo = modoDeJogo;
	}

	public String getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(String dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	
}
