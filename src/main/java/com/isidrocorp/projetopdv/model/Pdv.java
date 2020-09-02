package com.isidrocorp.projetopdv.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="itmn880_pdv")
public class Pdv {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="numero_ponto")
	private int numeroPonto;
	
	@Column(name="nome", length=100)
	private String nome;
	
	@Column(name="endereco", length=100)
	private String endereco;
	
	@Column(name="telefone", length=20)
	private String telefone;
	
	public List<Solicitacao> getSolicitacoes() {
		return solicitacoes;
	}

	public void setSolicitacoes(List<Solicitacao> solicitacoes) {
		this.solicitacoes = solicitacoes;
	}

	@OneToMany(mappedBy="pdv", cascade=CascadeType.ALL)
	private List<Solicitacao> solicitacoes;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumeroPonto() {
		return numeroPonto;
	}

	public void setNumeroPonto(int numeroPonto) {
		this.numeroPonto = numeroPonto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	

}
