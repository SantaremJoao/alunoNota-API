package com.nota.notalunoapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.nota.notalunoapi.model.Notas;
import com.nota.notalunoapi.repository.NotaRepository;

@RestController
@RequestMapping("/notas")
public class NotaController {
	@Autowired
	private NotaRepository notasRepository;
	@GetMapping
	public List<Notas> hello() {
		return notasRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void hello(@RequestBody Notas nota) {
		 notasRepository.save(nota);
	}


}
