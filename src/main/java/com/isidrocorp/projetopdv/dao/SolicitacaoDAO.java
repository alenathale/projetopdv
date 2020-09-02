package com.isidrocorp.projetopdv.dao;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.isidrocorp.projetopdv.model.Solicitacao;

public interface SolicitacaoDAO extends CrudRepository<Solicitacao, Integer> {
	
	public ArrayList<Solicitacao> findBySituacao(int situacao);

}
