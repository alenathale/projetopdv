package com.isidrocorp.projetopdv.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.isidrocorp.projetopdv.dao.PdvDAO;
import com.isidrocorp.projetopdv.model.Pdv;

@RestController
public class PdvController {

	@Autowired
	PdvDAO dao;
	
	@GetMapping("/pdv/todos")
	public ArrayList<Pdv> recuperarTodos(){
		ArrayList<Pdv> lista;
		lista = (ArrayList<Pdv>)dao.findAll();
		return lista;
	}
}
