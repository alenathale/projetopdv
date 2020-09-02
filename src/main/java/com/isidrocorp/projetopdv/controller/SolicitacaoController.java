package com.isidrocorp.projetopdv.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.isidrocorp.projetopdv.dao.SolicitacaoDAO;
import com.isidrocorp.projetopdv.model.Solicitacao;

@RestController
public class SolicitacaoController {
	
	@Autowired
	SolicitacaoDAO dao;
	
	
	@GetMapping("/solicitacao/todas")
	public ArrayList<Solicitacao> recuperarTodas(){
		ArrayList<Solicitacao> lista;
		lista = (ArrayList<Solicitacao>)dao.findAll();
		return lista;
	}
	
	@GetMapping("/solicitacao/status/{situacao}")

	public ArrayList<Solicitacao> recuperarPorSituacao(@PathVariable int situacao){

	ArrayList<Solicitacao> lista;

	lista = dao.findBySituacao(situacao);

	 return lista;

	}
	
	@PostMapping("/solicitacao/nova")
	public ResponseEntity<Solicitacao> adicionarNova(@RequestBody Solicitacao novaSolicitacao){
		try {
			dao.save(novaSolicitacao);
			return ResponseEntity.status(201).body(novaSolicitacao);
		}
		catch(Exception ex) {
			return ResponseEntity.badRequest().build();
			
		}
		
	}
}
